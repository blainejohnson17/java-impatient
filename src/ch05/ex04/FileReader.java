package ch05.ex04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
  public enum ResultStatus {
    SUCCESS, INVALID_FILENAME, FILE_NOT_FOUND, INVALID_FORMAT
  };

  public static class Result<T> {
    private ResultStatus status;
    private T value;

    Result(ResultStatus status) {
      this.status = status;
    }

    Result(T value) {
      this.value = value;
      this.status = ResultStatus.SUCCESS;
    }

    public ResultStatus getStatus() {
      return status;
    }

    public T getValue() {
      return value;
    }
  }

  public Result<ArrayList<Double>> readValues(String filename) {
    if (filename == null || filename.isEmpty()) {
      return new Result<ArrayList<Double>>(ResultStatus.INVALID_FILENAME);
    }

    File file = new File(filename);

    try (Scanner in = new Scanner(file)) {
      ArrayList<Double> values = new ArrayList<>();
      while (in.hasNext()) {
        Double val = Double.parseDouble(in.next());
        values.add(val);
      }
      return new Result<ArrayList<Double>>(values);
    } catch (FileNotFoundException e) {
      return new Result<ArrayList<Double>>(ResultStatus.FILE_NOT_FOUND);
    } catch (NumberFormatException ex) {
      return new Result<ArrayList<Double>>(ResultStatus.INVALID_FORMAT);
    }
  }

}
