package com.access.two;
import com.access.one.Base;
public class Derived extends Base {
    public void testAccess() {
        System.out.println("Testing access from another package:");
        publicMethod();       
        protectedMethod();    
        callPrivate();       
    }
}