package com.epam.sonar.test;

public class TestClass extends Exception {
    private static final long serialVersionUID = 9147287441524325889L;
    
    private final String message = "sample";

    public static void main(String[] args) {
        TestClass class1 = new TestClass();
        System.out.println(TestClass.serialVersionUID);
    }
}
