package ch07.ex11;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;


class ExerciseTest {

  @Test
  void testShuffleInner() {
    List<String> shuffled = Exercise.shuffleInner("zero one two three four five");
    assertEquals(6, shuffled.size());
    assertEquals("zero", shuffled.get(0));
    assertEquals("five", shuffled.get(5));
    assertNotEquals(Arrays.asList("one", "two", "three", "four"), shuffled.subList(1, 5));
    assertThat(shuffled.subList(1, 5), containsInAnyOrder("one", "two", "three", "four"));
  }

}
