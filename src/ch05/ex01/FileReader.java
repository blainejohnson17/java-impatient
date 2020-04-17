package ch05.ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

  public ArrayList<Double> readValues(String filename) throws FileNotFoundException {
    if (filename == null || filename.isEmpty()) {
      throw new IllegalArgumentException("must be a valid filename");
    }
    File file = new File(filename);
    Scanner in = new Scanner(file);

    ArrayList<Double> values = new ArrayList<>();
    while (in.hasNext()) {
      Double val = Double.parseDouble(in.next());
      values.add(val);
    }

    in.close();

    return values;
  }

}
