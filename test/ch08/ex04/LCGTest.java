package ch08.ex04;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class LCGTest {

  @Test
  void testGenerate() {
    Stream<Long> lcgStream = LCG.generate(2, 3, 5, 1);

    Object[] actual = lcgStream.limit(9).toArray();
    Long[] expected = {1L, 0L, 3L, 4L, 1L, 0L, 3L, 4L, 1L};
    assertArrayEquals(expected, actual);
  }

}
