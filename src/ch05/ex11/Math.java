package ch05.ex11;

import java.util.Arrays;

public class Math {
  public static int min(int[] numbers) {
    int smallest = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] < smallest)
        smallest = numbers[i];
    }
    final int s = smallest;
    assert Arrays.stream(numbers).allMatch(number -> s <= number);
    return smallest;
  }
}
