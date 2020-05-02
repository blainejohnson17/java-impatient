package ch06.ex14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

  @Test
  public void testCloseAll() {
    Exception ex1 = new Exception("ex1");
    Exception ex2 = new Exception("ex2");
    Exception ex3 = new Exception("ex3");
    ArrayList<AutoCloseable> list = new ArrayList<>();
    AutoCloseable a = () -> {
      throw ex1;
    };
    AutoCloseable b = () -> {
      throw ex2;
    };
    AutoCloseable c = () -> {
      throw ex3;
    };
    list.add(a);
    list.add(b);
    list.add(c);

    Exception exception = assertThrows(Exception.class, () -> {
      ArrayUtils.closeAll(list);
    });

    assertEquals(ex3.getMessage(), exception.getMessage());
    assertEquals(ex2.getMessage(), exception.getCause().getMessage());
    assertEquals(ex1.getMessage(), exception.getCause().getCause().getMessage());
  }

}
