
/**
 * Write a description of class Person here.
 *
 * Little Person class tro be used to write and read to Text files
 * Mora
 * April 2021
 */
public class Person {
  // instance variables -
  private int age;
  private String name;

  /**
   * Constructor for objects of class Identity
   */
  public Person(String n, int a) {
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
