package ch07.ex14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise {

  public static List<Integer> immutableRange(int end) {
    List<Integer> intList = new ArrayList<>(end + 1);
    for (int i = 0; i <= end; i++) {
      intList.add(i);
    }
    return Collections.unmodifiableList(intList);
  }
}
