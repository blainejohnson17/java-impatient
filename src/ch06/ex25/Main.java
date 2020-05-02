package ch06.ex25;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.SortedMap;

public class Main {

  public static void main(String[] args) throws NoSuchMethodException, SecurityException {
    // Method[] methods = String.class.getMethods();
    // Method[] methods = Arrays.class.getMethods();
    // for (Method m : methods) {
    // if (m.getName() != "join")
    // continue;
    Method m =
        Collections.class.getMethod("checkedSortedMap", SortedMap.class, Class.class, Class.class);
    System.out.println(Exercise.generateDeclaration(m));
    // }
  }

}
