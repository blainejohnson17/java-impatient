package ch06.ex25;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise {
  public static String generateDeclaration(Method m) {
    TypeVariable<Method>[] types = m.getTypeParameters();
    Parameter[] params = m.getParameters();
    Type returnType = m.getGenericReturnType();
    int modifier = m.getModifiers();
    String name = m.getName();
    String declaration = Modifier.toString(modifier) + " ";
    if (types.length > 0) {
      declaration += "<";
      declaration +=
          Arrays.asList(types).stream().map(t -> t.getName()).collect(Collectors.joining(", "));
      declaration += "> ";
    }
    declaration += returnType.getTypeName() + " " + name + "(";
    if (params.length > 0) {
      declaration +=
          Arrays.asList(params).stream().map(p -> p.toString()).collect(Collectors.joining(", "));
    }
    declaration += ")";
    return declaration;
  }
}
