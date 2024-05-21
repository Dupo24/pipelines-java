package com.microsoft.demo;
// Demo class
public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered with flag set to true.");
            return;
        }

        System.out.println("I am not covered normally, but a false flag in the test will cover me");
    }
}
