package ch05.ex10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MathTest {

  @Test
  void testFactorial() {
    // assertEquals(1, Math.factorial(0));
    // assertEquals(1, Math.factorial(1));
    // assertEquals(2, Math.factorial(2));
    // assertEquals(6, Math.factorial(3));
    assertEquals(24, Math.factorial(4));
  }

}
