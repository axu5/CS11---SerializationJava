import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Writing to a file example code\
 * 
 * @author axu5 <github.com/axu5>
 * @version 28.03.2022
 */
public class WritingToFileToComplete {
  public static void main(String[] args) {
    // Instantiate five Person objects
    Person[] people = new Person[5];
    people[0] = new Person("Mora", 45);
    people[1] = new Person("Aleks", 16);
    people[2] = new Person("Frank", 17);
    people[3] = new Person("Luca", 16);
    people[4] = new Person("Eren", 17);

    // Create the output file
    File file = new File("file_with_people_data.txt");
    // writing to the file
    try {
      // code you try to run
      PrintWriter output = new PrintWriter(file);
      for (Person person : people) {
        output.println(person.getName() + " " + person.getAge());
      }

      output.close();
    } catch (IOException error) {
      // Display an error message
      System.out.println("Error " + error);
    }
  }
}