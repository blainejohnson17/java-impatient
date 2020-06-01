package ch08.ex15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.math.BigInteger;
import java.util.List;
import org.junit.jupiter.api.Test;

class ExerciseTest {

  @Test
  void testFindPrimes() {
    List<BigInteger> primes = Exercise.findPrimes(new BigInteger("999"), 500);
    assertEquals(500, primes.size());

    for (BigInteger n : primes) {
      assertTrue(n.isProbablePrime(10));
      assertEquals(4, n.toString().length());
    }
  }

  @Test
  void testFindPrimesParallel() {
    List<BigInteger> primes = Exercise.findPrimesParallel(new BigInteger("999"), 500);
    assertEquals(500, primes.size());

    for (BigInteger n : primes) {
      assertTrue(n.isProbablePrime(10));
      assertEquals(4, n.toString().length());
    }
  }

  @Test
  void testFindPrimesSpeed() {
    String s = "";
    for (int i = 0; i < 49; i++) {
      s = s.concat("9");
    }
    BigInteger startBigInt = new BigInteger(s);
    long count = 500;

    long startSerial = System.currentTimeMillis();
    Exercise.findPrimes(startBigInt, count);
    long endSerial = System.currentTimeMillis();

    System.out.println("Test Serial: " + (endSerial - startSerial));

    long startParallel = System.currentTimeMillis();
    Exercise.findPrimesParallel(startBigInt, count);
    long endParallel = System.currentTimeMillis();

    System.out.println("Test Parallel: " + (endParallel - startParallel));
  }

}
