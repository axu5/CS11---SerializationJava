
/**
 * Write a description of class WritingToFileSerializedToFill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
// import java.io.FileInputStream ;
// import java.io.ObjectInputStream ;
import java.io.FileNotFoundException;
import java.io.IOException;
// import java.io.EOFException ;
import java.util.ArrayList;

public class WritingToFileSerializedToFill {
  public static void main(String arg[]) throws FileNotFoundException, IOException, ClassNotFoundException {
    File myFile = new File("File_with_serializable_data_class.txt");

    // create an array list with mane Persons
    ArrayList<PersonSerialized> listOfPerson = new ArrayList<PersonSerialized>();

    // Add 5 persons in the Array
    listOfPerson.add(new PersonSerialized("Mora", 45));
    listOfPerson.add(new PersonSerialized("Aleks", 16));
    listOfPerson.add(new PersonSerialized("Frank", 17));
    listOfPerson.add(new PersonSerialized("Luca", 16));
    listOfPerson.add(new PersonSerialized("Eren", 17));

    // Serialize the Collection of Person
    FileOutputStream fos = new FileOutputStream(myFile);
    ObjectOutputStream output = new ObjectOutputStream(fos);
    // Loop on the Collection of Persons

    for (PersonSerialized person : listOfPerson) {
      output.writeObject(person);
    }
    output.close();
    fos.close();
  }
}
