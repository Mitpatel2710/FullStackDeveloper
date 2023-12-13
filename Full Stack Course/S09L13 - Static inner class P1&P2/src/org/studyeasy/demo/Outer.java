package org.studyeasy.demo;

public class Outer {
//    private static int testVar = 5;
    public static void testOuterMethod(){
        System.out.println("Value of inner class variable: " + Inner.x);
        Inner.testingInnerMethod();
//        System.out.println("From outer method");
    }
    public static class Inner {
        public static int x = 0;

        public static void testingInnerMethod() {
            System.out.println("Testing inner class method");
//            System.out.println("Test variable " + testVar);
//            testOuterMethod();
        }
    }
}
