package org.studyeasy;

import org.studyeasy.person.Person;
import org.studyeasy.person.Vegan;

public class Hello {
    public static void main(String[] args) {
        Person john = new Vegan();
        john.speak();
        john.eat();
        john.breath();
        john.message();

    }
}

