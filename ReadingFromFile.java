import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * ReadingFromFile.java
 *
 * File reader example
 *
 * @author axu5 <github.com/axu5>
 * @version 28.03.2022
 */
public class ReadingFromFile {
  public static void main(String[] _args) throws FileNotFoundException {
    File file = new File("file_with_people_data.txt");

    try {
      Scanner sc = new Scanner(file);
      while (sc.hasNext()) {
        String name = sc.next();
        int age = sc.nextInt();
        System.out.println(name + " " + age);
      }

      sc.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }
}