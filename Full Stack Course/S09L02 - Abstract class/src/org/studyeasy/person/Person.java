package org.studyeasy.person;

public abstract class Person implements IsAlive,LiveLife{
    public void speak(){
        System.out.println("Share his/her thoughts");
    }
    @Override
    public void breath(){
        System.out.println("be alive; remain living");
    }

    @Override
    public void message() {
        System.out.println("Life is a journey, keep moving and meet new people");
    }

    public abstract void eat();

}
