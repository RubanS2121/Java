package com.example.InnerClasses;

public interface Watchable {

    default void grow(){
        System.out.println("This is Interface's defined method");
    }
}
