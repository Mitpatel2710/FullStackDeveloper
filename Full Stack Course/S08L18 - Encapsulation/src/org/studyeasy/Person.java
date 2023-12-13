
/*
  Encapsulation in Java is a concept that refers to the practice of bundling data and methods that operate on that
  data within a single unit, known as a class. In simple words, it means that the internal workings of a class
  are hidden from the outside world, and only a well-defined interface is exposed for interacting with the class.
  Encapsulation provides several benefits, including:

  1. Data hiding: Encapsulated classes can keep their internal data private, which helps prevent external code from
  modifying the data in unexpected ways.
  2. Modularity: By bundling related data and methods into a single unit, encapsulation promotes modularity and helps
  keep code organized and maintainable.
  3. Abstraction: Encapsulation allows the details of how a class works to be hidden behind a well-defined interface,
  which promotes abstraction and helps simplify complex systems.
*/

package org.studyeasy;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        this.name = "John Doe";
        this.age = 25;
        this.gender = "Male";
    }
    //Parametrize constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public boolean setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
            return true;
        }
        return false;
    }


}
