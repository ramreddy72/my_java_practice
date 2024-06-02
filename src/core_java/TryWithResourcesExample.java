package core_java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {

    /*This statement was first introduced in Java 7 to avoid the redundant code that we had to write for exception handling. The advantages of this statement are:
        1. Try with resources closes all the resources (file, database connection, network connection etc.) automatically. No need to close them explicitly. This prevents memory leaks.
        2. With the help of try with resource we can reduce the unnecessary lines of code and makes the code more readable. 
    */
    public static void main(String[] args) {
        String filePath = "sample.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    /*In this example, the BufferedReader is automatically closed after the try block, regardless of whether an exception occurs or not. This ensures proper resource cleanup and prevents resource leaks in Java applications. */
}
