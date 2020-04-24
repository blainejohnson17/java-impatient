package ch06.ex02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StackETest {

  @Test
  public void testStackEE() {
    StackE<String> stack = new StackE<>(String.class);

    assertTrue(stack.isEmpty());

    // handles growing the array from initial size 10
    for (int i = 0; i < 15; i++) {
      stack.push(Integer.toString(i));
      assertFalse(stack.isEmpty());
    }

    for (int i = 14; i >= 0; i--) {
      System.out.println(Integer.toString(i));
      assertEquals(Integer.toString(i), stack.pop());
      if (i != 0)
        assertFalse(stack.isEmpty());
    }
    assertTrue(stack.isEmpty());
  }

}
