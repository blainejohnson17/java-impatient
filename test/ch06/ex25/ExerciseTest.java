package ch06.ex25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.SortedMap;
import org.junit.jupiter.api.Test;

public class ExerciseTest {

  @Test
  void testGenerateDeclaration() throws NoSuchMethodException, SecurityException {
    Method m =
        Collections.class.getMethod("checkedSortedMap", SortedMap.class, Class.class, Class.class);

    String declaration = Exercise.generateDeclaration(m);
    String expected =
        "public static <K, V> java.util.SortedMap<K, V> checkedSortedMap(java.util.SortedMap<K, V> arg0, java.lang.Class<K> arg1, java.lang.Class<V> arg2)";
    assertEquals(expected, declaration);
  }

}
