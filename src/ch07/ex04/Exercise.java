package ch07.ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {

  public static void produceConcurrentModificationException() {
    List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3));

    for (Integer integer : intList) {
      intList.remove(1);
    }
  }

}
