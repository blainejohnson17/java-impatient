package ch03.ex07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("b");
    list.add("cc");
    list.add("a");
    luckySort(list, String::compareTo);
    list.forEach(System.out::println);
  }

  public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
    while (!isSorted(strings, comp)) {
      Collections.shuffle(strings);
    }
  }

  private static boolean isSorted(ArrayList<String> strings, Comparator<String> comp) {
    for (int i = 0; i < strings.size() - 1; i++) {
      if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) {
        return false;
      }
    }
    return true;
  }

}
