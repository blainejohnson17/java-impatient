package ch03.ex04;

public class Main {

  public static void main(String[] args) {
    IntSequence intSeq = IntSequence.of(2, 3, 4, 5);

    while (intSeq.hasNext()) {
      System.out.println(intSeq.next());
    }
  }

}
