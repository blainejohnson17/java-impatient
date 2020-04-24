package ch06.ex01;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {
  private List<E> stack;

  public Stack() {
    stack = new ArrayList<>();
  }

  public void push(E element) {
    stack.add(element);
  }

  public E pop() {
    int idx = stack.size() - 1;
    E element = stack.get(idx);
    stack.remove(idx);
    return element;
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }

}
