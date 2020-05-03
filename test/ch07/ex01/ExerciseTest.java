package ch07.ex01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ExerciseTest {
  private List<Integer> primes50 =
      Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
  private List<Integer> primes100 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
      43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

  @Test
  void testSeiveWithHashSet() {
    assertEquals(primes50, Exercise.seiveWithHashSet(50));
    assertEquals(primes100, Exercise.seiveWithHashSet(100));
  }

  @Test
  void testSeiveWithBitSet() {
    assertEquals(primes50, Exercise.seiveWithBitSet(50));
    assertEquals(primes100, Exercise.seiveWithBitSet(100));
  }

}
