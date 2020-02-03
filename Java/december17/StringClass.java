package com.example.december17;

import java.io.Serializable;

public class StringClass<S extends String>{

    S Value;

    public S getValue() {
        return Value;
    }

    public void setValue(S value) {
        Value = value;
    }

    public void show(){
        System.out.println(Value.getClass().getName());
    }

}
