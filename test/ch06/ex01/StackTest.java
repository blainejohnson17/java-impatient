package ch06.ex01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StackTest {

  @Test
  public void testStack() {
    Stack<String> stack = new Stack<>();

    assertTrue(stack.isEmpty());

    stack.push("one");
    assertFalse(stack.isEmpty());

    stack.push("two");
    assertFalse(stack.isEmpty());

    String two = stack.pop();
    assertEquals("two", two);
    assertFalse(stack.isEmpty());

    String one = stack.pop();
    assertEquals("one", one);
    assertTrue(stack.isEmpty());
  }

}
