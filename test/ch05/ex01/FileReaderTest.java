package ch05.ex01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

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
    ArrayList<Double> values = reader.readValues(tempFile.toString());
    Double[] a = {1.2, 2.3};
    ArrayList<Double> expected = new ArrayList<Double>(Arrays.asList(a));
    assertEquals(expected, values);
  }

  @Test
  public void testReadValuesNullFilename() {
    FileReader reader = new FileReader();
    assertThrows(IllegalArgumentException.class, () -> {
      reader.readValues(null);
    });
  }

  @Test
  public void testReadValuesEmptyFilename() {
    FileReader reader = new FileReader();
    assertThrows(IllegalArgumentException.class, () -> {
      reader.readValues("");
    });
  }

  @Test
  public void testReadValuesInvalidFilename() {
    FileReader reader = new FileReader();
    assertThrows(FileNotFoundException.class, () -> {
      reader.readValues("foo.bar");
    });
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

    assertThrows(NumberFormatException.class, () -> {
      reader.readValues(tempFile.toString());
    });
  }

}
