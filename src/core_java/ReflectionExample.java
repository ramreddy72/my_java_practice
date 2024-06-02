package core_java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionExample {
   public static void main(String[] args) throws Exception {
        // Obtain the class object for the String class
        Class<?> stringClass = String.class;

        // Get information about the class
        System.out.println("Class Name: " + stringClass.getName());
        System.out.println("Superclass: " + stringClass.getSuperclass().getName());

        // Create an instance of the class using reflection
        Constructor<?> constructor = stringClass.getConstructor(String.class);
        String strInstance = (String) constructor.newInstance("Hello, Reflection!");

        // Invoke a method dynamically
        Method method = stringClass.getMethod("toUpperCase");
        String result = (String) method.invoke(strInstance);
        System.out.println("Result: " + result);
    }
}
