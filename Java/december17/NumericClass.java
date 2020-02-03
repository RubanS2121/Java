package com.example.december17;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

public class NumericClass<E extends Number> implements Serializable {

    E value;
    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;

    }

    public void show(){
        System.out.println(value);
    }




}
