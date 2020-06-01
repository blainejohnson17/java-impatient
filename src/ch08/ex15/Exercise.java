package ch08.ex15;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise {
  public static List<BigInteger> findPrimes(BigInteger start, long count) {
    Stream<BigInteger> stream = Stream.iterate(start, n -> n.add(BigInteger.ONE));
    return stream.filter(n -> n.isProbablePrime(100)).limit(count).collect(Collectors.toList());
  }

  public static List<BigInteger> findPrimesParallel(BigInteger start, long count) {
    Stream<BigInteger> stream = Stream.iterate(start, n -> n.add(BigInteger.ONE));
    return stream.parallel().filter(n -> n.isProbablePrime(100)).limit(count)
        .collect(Collectors.toList());
  }
}
