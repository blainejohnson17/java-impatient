package ch05.ex03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import ch05.ex03.FileReader.Result;
import ch05.ex03.FileReader.ResultStatus;

public class FileReaderTest {

  @Test
  public void testReadValuesValid() throws IOException {
    Path tempFile = Files.createTempFile("tempfiles", ".txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile.toString()));
    bw.write("1.2");
    bw.newLine();
    bw.write("2.3");
    bw.close();

    FileReader reader = new FileReader();
    Result<ArrayList<Double>> result = reader.readValues(tempFile.toString());

    assertEquals(ResultStatus.SUCCESS, result.getStatus());

    Double[] a = {1.2, 2.3};
    ArrayList<Double> expected = new ArrayList<Double>(Arrays.asList(a));
    assertEquals(expected, result.getValue());
  }

  @Test
  public void testReadValuesNullFilename() {
    FileReader reader = new FileReader();
    Result<ArrayList<Double>> result = reader.readValues(null);
    assertEquals(ResultStatus.INVALID_FILENAME, result.getStatus());
  }

  @Test
  public void testReadValuesEmptyFilename() {
    FileReader reader = new FileReader();
    Result<ArrayList<Double>> result = reader.readValues("");
    assertEquals(ResultStatus.INVALID_FILENAME, result.getStatus());
  }

  @Test
  public void testReadValuesInvalidFilename() {
    FileReader reader = new FileReader();
    Result<ArrayList<Double>> result = reader.readValues("foo.bar");
    assertEquals(ResultStatus.FILE_NOT_FOUND, result.getStatus());
  }

  @Test
  public void testReadValuesInvalidFileContents() throws IOException {
    Path tempFile = Files.createTempFile("tempfiles", ".txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile.toString()));
    bw.write("1.2");
    bw.newLine();
    bw.write("boo");
    bw.close();

    FileReader reader = new FileReader();
    Result<ArrayList<Double>> result = reader.readValues(tempFile.toString());
    assertEquals(ResultStatus.INVALID_FORMAT, result.getStatus());
  }

}
