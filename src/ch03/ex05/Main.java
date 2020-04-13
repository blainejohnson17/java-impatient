package ch03.ex05;

public class Main {

  public static void main(String[] args) {
    IntSequence intSeq = IntSequence.constant(2);

    int i = 0;
    while (intSeq.hasNext() && i < 100) {
      System.out.println(intSeq.next());
      i++;
    }
  }

}
