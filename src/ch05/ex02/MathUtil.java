package ch05.ex02;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import ch05.ex01.FileReader;

public class MathUtil {

  public static double sumOfValues(String filename) throws FileNotFoundException {
    FileReader reader = new FileReader();
    ArrayList<Double> values = reader.readValues(filename);
    double sum = 0;
    for (double val : values) {
      sum += val;
    }
    return sum;
  }

}
