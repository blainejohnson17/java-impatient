package ch03.ex15;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    IntSequence randoms = randomInts(2, 10);

    for (int i = 0; i < 10; i++) {
      System.out.println(randoms.next());
    }
  }

  public static IntSequence randomInts(int low, int high) {
    return new RandomSequence(low, high);
  }

  public static class RandomSequence implements IntSequence {
    private final int low;
    private final int high;
    private final Random generator = new Random();

    RandomSequence(int low, int high) {
      this.low = low;
      this.high = high;
    }

    @Override
    public int next() {
      return low + generator.nextInt(high - low + 1);
    }
  }

}
