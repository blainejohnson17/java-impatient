package ch03.ex11;

import java.io.File;

public class Main {

  public static void main(String[] args) {
    String[] filenames = getFilenames("./resources", ".csv");
    for (String filename : filenames) {
      System.out.println(filename);
    }
  }

  public static String[] getFilenames(String filepath, String extension) {
    File path = new File(filepath);
    return path.list((dir, name) -> name.endsWith(extension));
  }

}
