package ch06.ex06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import ch06.ex06.ArrayUtils;

public class ArrayUtilsTest {

  @Test
  public void testAppendWithExtend() {
    ArrayList<String> dest = new ArrayList<>();
    dest.add("one");
    ArrayList<String> src = new ArrayList<>();
    src.add("two");

    ArrayUtils.appendWithExtend(dest, src);

    assertEquals("one", dest.get(0));
    assertEquals("two", dest.get(1));
  }

  @Test
  public void testAppendWithSuper() {
    ArrayList<String> dest = new ArrayList<>();
    dest.add("one");
    ArrayList<String> src = new ArrayList<>();
    src.add("two");

    ArrayUtils.appendWithSuper(dest, src);

    assertEquals("one", dest.get(0));
    assertEquals("two", dest.get(1));
  }

}
