package ch06.ex02;

import java.util.Arrays;

public class StackE<E> {
  private E[] stack;
  private int last = -1;

  @SuppressWarnings("unchecked")
  public StackE(Class<E> cl) {
    stack = (E[]) java.lang.reflect.Array.newInstance(cl, 10);
  }

  public void push(E element) {
    if (last == stack.length - 1) {
      stack = Arrays.copyOf(stack, stack.length + 10);
    }
    stack[++last] = element;
  }

  public E pop() {
    return stack[last--];
  }

  public boolean isEmpty() {
    return last < 0;
  }

}
