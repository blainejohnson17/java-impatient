package ch04.ex08;

public class Main {

  public static void main(String[] args) {
    // array
    printClassNames(String[].class);

    // generic
    printClassNames(GenericClassDemo.class);

    // innerClass
    class InnerClassDemo {
    };
    printClassNames(InnerClassDemo.class);

    // primatives
    printClassNames(byte.class);
    printClassNames(char.class);
    printClassNames(short.class);
    printClassNames(int.class);
    printClassNames(long.class);
    printClassNames(float.class);
    printClassNames(double.class);
    printClassNames(boolean.class);
    printClassNames(void.class);
  }

  public static void printClassNames(Class cls) {
    System.out.println("** Printing classnames **");
    System.out.println("getCanonicalName: " + cls.getCanonicalName());
    System.out.println("getSimpleName:    " + cls.getSimpleName());
    System.out.println("getTypeName:      " + cls.getTypeName());
    System.out.println("getName:          " + cls.getName());
    System.out.println("toString:         " + cls.toString());
    System.out.println("toGenericString:  " + cls.toGenericString());
    System.out.println("*************************");
    System.out.println("");
  }

}


class GenericClassDemo<T> {
  private T t;

  public void set(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }
}
