
/**
 * Write a description of class PersonSerialized here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.Serializable;

public class PersonSerialized implements Serializable {
  private int age;
  private String name;

  /**
   * Constructor for objects of class Identity
   */
  public PersonSerialized(String n, int a) {
    // initialise instance variables
    age = a;
    name = n;
  }

  // Setters MUTATORS
  public void setAge(int a) {
    age = a;
  }

  public void setName(String n) {
    name = n;
  }

  // Getters ACCESSORS
  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }
}
