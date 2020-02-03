package com.example.december11;

public class StringImmutability {

    public static void main(String[] args){

        String name="hello";

        System.out.println(name.hashCode());

        name.concat(" Kapil");

        System.out.println(name);
        System.out.println(name.hashCode());

        name=name.concat(" Java");

        System.out.println(name);
        System.out.println(name.hashCode());


        //String Buffer is mutable
        StringBuffer sb=new StringBuffer();
        StringBuilder ss=new StringBuilder();
        sb.append("henlo");
        System.out.println(sb);
        sb.append(" Byte");
        System.out.println(sb);

        //String Buffer methods
        sb.replace(0,5,"HELLO");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append(" OnePlus ");
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.trimToSize();
        System.out.println(sb.capacity());
        sb.append(".");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.reverse();
        System.out.println(sb);

    }
}
