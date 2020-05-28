package ch08.ex06;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ExerciseTest {

  @Test
  void testIsWord() {
    assertTrue(Exercise.isWord("Hello"));
    assertFalse(Exercise.isWord("H@t"));
  }

  @Test
  void testIsValidJavaIdentifier() {
    assertTrue(Exercise.isValidJavaIdentifier("_startsWithUnderscore"));
    assertTrue(Exercise.isValidJavaIdentifier("$startsWithDollar"));
    assertTrue(Exercise.isValidJavaIdentifier("startsWithAlpha"));
    assertTrue(Exercise.isValidJavaIdentifier("StartsWithAlphaUpper"));
    assertTrue(Exercise.isValidJavaIdentifier("ALLCAPS"));
    assertTrue(Exercise.isValidJavaIdentifier("ALL_CAPS_WITH_UNDERSCORE"));
    assertTrue(Exercise.isValidJavaIdentifier("alllower"));
    assertTrue(Exercise.isValidJavaIdentifier("$_"));

    assertFalse(Exercise.isValidJavaIdentifier("123"));
    assertFalse(Exercise.isValidJavaIdentifier("123StartsWithNum"));
    assertFalse(Exercise.isValidJavaIdentifier("contains spaces"));
    assertFalse(Exercise.isValidJavaIdentifier("*"));
  }

}
