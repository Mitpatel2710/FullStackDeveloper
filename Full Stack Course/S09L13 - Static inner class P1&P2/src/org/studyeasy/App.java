package org.studyeasy;

import org.studyeasy.demo.Outer;

public class App {
    public static void main(String[] args) {
        new Outer().testOuterMethod();
        Outer.testOuterMethod();
//        Outer.Inner.testingInnerMethod();
//        System.out.println(Outer.Inner.x);
    }
}