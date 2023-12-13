package org.studyeasy;

public class Hello {
    public static void main(String[] args) {
        Person john = new Person();
        System.out.println(john);
        Person pooja  = new Person("Pooja", 26, "Female");// object
        System.out.println(pooja);
        pooja.setAge(-30);
        System.out.println(pooja);
        john.setAge(24);
        System.out.println(john);
        pooja.setAge(22);
        System.out.println(pooja);

    }
}
