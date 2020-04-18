package ch05.ex03;

import java.util.ArrayList;
import ch05.ex03.FileReader.Result;
import ch05.ex03.FileReader.ResultStatus;

public class MathUtil {

  public static Result<Double> sumOfValues(String filename) {
    FileReader reader = new FileReader();
    Result<ArrayList<Double>> result = reader.readValues(filename);
    if (result.getStatus() == ResultStatus.SUCCESS) {
      double sum = 0;
      for (double val : result.getValue()) {
        sum += val;
      }
      return new Result<Double>(sum);
    } else {
      return new Result<Double>(result.getStatus());
    }
  }

}
