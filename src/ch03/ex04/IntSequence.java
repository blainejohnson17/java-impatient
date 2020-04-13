package ch03.ex04;

public interface IntSequence {
  boolean hasNext();

  int next();

  public static IntSequence of(int... ints) {
    return new IntSequence() {
      private int currentIdx = 0;

      @Override
      public boolean hasNext() {
        if (currentIdx < ints.length) {
          return true;
        } else {
          return false;
        }
      }

      @Override
      public int next() {
        return ints[currentIdx++];
      }
    };
  }
}
