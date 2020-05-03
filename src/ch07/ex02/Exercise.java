package ch07.ex02;

import java.util.List;
import java.util.ListIterator;

public class Exercise {

  public static List<String> toUpperWithIterator(List<String> list) {
    ListIterator<String> i = list.listIterator();
    while (i.hasNext()) {
      i.set(i.next().toUpperCase());
    }
    return list;
  }

  public static List<String> toUpperWithLoop(List<String> list) {
    for (int i = 0; i < list.size(); i++) {
      list.set(i, list.get(i).toUpperCase());
    }
    return list;
  }

  public static List<String> toUpperWithReplaceAll(List<String> list) {
    list.replaceAll(String::toUpperCase);
    return list;
  }

}
