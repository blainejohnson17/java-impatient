package ch03.ex10;

import java.io.File;
import java.io.FileFilter;

public class Main {

  public static void main(String[] args) {
    File[] subDirs;
    subDirs = getSubDirsLambda("./src");
    for (File dir : subDirs) {
      System.out.println(dir.getName());
    }

    subDirs = getSubDirsInnerFunc("./src");
    for (File dir : subDirs) {
      System.out.println(dir.getName());
    }

    subDirs = getSubDirsMethodRef("./src");
    for (File dir : subDirs) {
      System.out.println(dir.getName());
    }
  }

  public static File[] getSubDirsLambda(String filepath) {
    File path = new File(filepath);
    return path.listFiles(pathname -> pathname.isDirectory());
  }

  public static File[] getSubDirsInnerFunc(String filepath) {
    File path = new File(filepath);
    FileFilter filter = new FileFilter() {
      @Override
      public boolean accept(File pathname) {
        return pathname.isDirectory();
      }
    };
    return path.listFiles(filter);
  }

  public static File[] getSubDirsMethodRef(String filepath) {
    File path = new File(filepath);
    return path.listFiles(File::isDirectory);
  }

}
