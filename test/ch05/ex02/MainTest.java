package ch05.ex02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  public void testSumOfValues() throws IOException {
    Path tempFile = Files.createTempFile("tempfiles", ".txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile.toString()));
    bw.write("1.2");
    bw.newLine();
    bw.write("2.3");
    bw.close();
    Main main = new Main();
    double sum = main.sumOfValues(tempFile.toString());
    assertEquals(3.5, sum);
  }

  @Test
  public void testSumOfValuesNullFilename() {
    Main main = new Main();
    assertThrows(IllegalArgumentException.class, () -> {
      main.sumOfValues(null);
    });
  }

  @Test
  public void testSumOfValuesEmptyFilename() {
    Main main = new Main();
    assertThrows(IllegalArgumentException.class, () -> {
      main.sumOfValues("");
    });
  }

  @Test
  public void testSumOfValuesInvalidFilename() {
    Main main = new Main();
    assertThrows(FileNotFoundException.class, () -> {
      main.sumOfValues("foo.bar");
    });
  }

  @Test
  public void testSumOfValuesInvalidFileContents() throws IOException {
    Path tempFile = Files.createTempFile("tempfiles", ".txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile.toString()));
    bw.write("1.2");
    bw.newLine();
    bw.write("boo");
    bw.close();

    Main main = new Main();
    assertThrows(NumberFormatException.class, () -> {
      main.sumOfValues(tempFile.toString());
    });
  }

}
