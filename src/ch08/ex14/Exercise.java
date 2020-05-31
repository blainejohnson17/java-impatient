package ch08.ex14;

import java.util.stream.Stream;

public class Exercise {
  private static class Average {
    private double sum;
    private int count;

    public Average(double sum, int count) {
      this.sum = sum;
      this.count = count;
    }

    public double get() {
      return sum / count;
    }
  }

  public static Double average(Stream<Double> stream) {
    return stream.reduce(
        new Average(0, 0),
        (a, i) -> new Average(a.sum + i, a.count + 1),
        (a, b) -> new Average(a.sum + b.sum, a.count + b.count)
    ).get();
  }
}
