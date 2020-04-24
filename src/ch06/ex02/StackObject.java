package ch06.ex02;

import java.util.Arrays;

public class StackObject<E> {
  private Object[] stack;
  private int last = -1;

  public StackObject() {
    stack = new Object[10];
  }

  public void push(E element) {
    if (last == stack.length - 1) {
      stack = Arrays.copyOf(stack, stack.length + 10);
    }
    stack[++last] = element;
  }

  @SuppressWarnings("unchecked")
  public E pop() {
    return (E) stack[last--];
  }

  public boolean isEmpty() {
    return last < 0;
  }
}
