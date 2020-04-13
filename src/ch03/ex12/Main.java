package ch03.ex12;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {
    File path = new File("./resources");
    File[] sorted = sort(path.listFiles());
    for (File file : sorted) {
      System.out.println(file.getName());
    }
  }

  public static File[] sort(File[] files) {
    Arrays.sort(files,
        Comparator.comparing(File::isDirectory).reversed().thenComparing(File::getName));
    return files;
  }

}
