package ch05.ex03;

import java.io.FileNotFoundException;
import ch05.ex02.MathUtil;

public class Main {

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("valid filename required as first arg");
      return;
    }
    try {
      double sum = MathUtil.sumOfValues(args[0]);
      System.out.printf("sum of values: %s is %d", args[0], sum);
    } catch (FileNotFoundException e) {
      System.out.printf("Invalid filename arg: %s", args[0]);
    }
  }

}
