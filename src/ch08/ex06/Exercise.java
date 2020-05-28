package ch08.ex06;

public class Exercise {
  public static boolean isWord(String s) {
    return s.codePoints().allMatch(Character::isAlphabetic);
  }

  public static boolean isValidJavaIdentifier(String s) {
    return Character.isJavaIdentifierStart(s.charAt(0))
        && s.codePoints().allMatch(Character::isJavaIdentifierPart);
  }
}
