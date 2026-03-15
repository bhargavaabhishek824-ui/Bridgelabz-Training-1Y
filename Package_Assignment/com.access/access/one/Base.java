package com.access.one;
public class Base {
    public void publicMethod() {
        System.out.println("Public method accessed");
    }
    protected void protectedMethod() {
        System.out.println("Protected method accessed");
    }
    void defaultMethod() {
        System.out.println("Default method accessed");
    }
    private void privateMethod() {
        System.out.println("Private method accessed");
    }
    public void callPrivate() {
        privateMethod();   // called internally
    }
}