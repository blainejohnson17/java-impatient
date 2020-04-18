package ch05.ex05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TextTransformTest {
  private PrintStream originalErr;
  private ByteArrayOutputStream err;

  @BeforeEach
  public void setup() {
    originalErr = System.err;
    err = new ByteArrayOutputStream();
    System.setErr(new PrintStream(err));
  }

  @AfterEach
  public void teardown() {
    System.setErr(originalErr);
    err = null;
  }

  @Test
  public void testToLowerCase() throws IOException {
    Path in = Files.createTempFile("in", ".txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(in.toFile()));
    bw.write("FoO");
    bw.newLine();
    bw.write("bAr");
    bw.newLine();
    bw.write("baz");
    bw.close();

    Path out = Files.createTempFile("out", ".txt");

    TextTransform.toLowerCase(in, out);

    Scanner outScanner = new Scanner(out);
    assertEquals("foo", outScanner.next());
    assertEquals("bar", outScanner.next());
    assertEquals("baz", outScanner.next());
    outScanner.close();
  }

  @Test
  void testToLowerCaseInvalidInputPaths() throws IOException {
    Path in = Paths.get("foo.bar");
    Path out = Files.createTempFile("out", ".txt");

    TextTransform.toLowerCase(in, out);
    assertTrue(err.toString().contains("NoSuchFileException: foo.bar"));
  }

  @Test
  void testToLowerCaseInvalidOutputPaths() throws IOException {
    Path out = Paths.get("foo.bar");
    Path in = Files.createTempFile("in", ".txt");

    TextTransform.toLowerCase(in, out);
    assertTrue(err.toString().contains("NoSuchFileException: foo.bar"));
  }

}
