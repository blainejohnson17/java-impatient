package ch06.ex21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class ArraysTest {

  @Test
  void testConstruct() {
    List<String>[] listArray = Arrays.construct(10);
    assertEquals(10, listArray.length);

    String[] stringArray = Arrays.construct(20);
    assertEquals(20, stringArray.length);
  }

}
