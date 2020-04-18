package ch05.ex04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import ch05.ex04.MathUtil;
import ch05.ex04.FileReader.Result;
import ch05.ex04.FileReader.ResultStatus;

public class MathUtilTest {

  @Test
  public void testSumOfValues() throws IOException {
    Path tempFile = Files.createTempFile("tempfiles", ".txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile.toString()));
    bw.write("1.2");
    bw.newLine();
    bw.write("2.3");
    bw.close();
    Result<Double> result = MathUtil.sumOfValues(tempFile.toString());
    double sum = result.getValue();
    assertEquals(3.5, sum);
  }

  @Test
  public void testSumOfValuesNullFilename() {
    Result<Double> result = MathUtil.sumOfValues(null);
    assertEquals(ResultStatus.INVALID_FILENAME, result.getStatus());
  }

  @Test
  public void testSumOfValuesEmptyFilename() {
    Result<Double> result = MathUtil.sumOfValues("");
    assertEquals(ResultStatus.INVALID_FILENAME, result.getStatus());
  }

  @Test
  public void testSumOfValuesInvalidFilename() {
    Result<Double> result = MathUtil.sumOfValues("foo.bar");
    assertEquals(ResultStatus.FILE_NOT_FOUND, result.getStatus());
  }

  @Test
  public void testSumOfValuesInvalidFileContents() throws IOException {
    Path tempFile = Files.createTempFile("tempfiles", ".txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile.toString()));
    bw.write("1.2");
    bw.newLine();
    bw.write("boo");
    bw.close();

    Result<Double> result = MathUtil.sumOfValues(tempFile.toString());
    assertEquals(ResultStatus.INVALID_FORMAT, result.getStatus());
  }

}
