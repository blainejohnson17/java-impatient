package ch05.ex05;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class TextTransform {
  public static void toLowerCase(Path inPath, Path outPath) {
    Scanner in = null;
    PrintWriter out = null;
    try {
      in = new Scanner(inPath);
      out = new PrintWriter(outPath.toFile());
      while (in.hasNext()) {
        out.println(in.next().toLowerCase());
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (IllegalStateException e) {
      e.printStackTrace();
    }
    if (in != null) {
      try {
        in.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    if (out != null) {
      try {
        out.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
