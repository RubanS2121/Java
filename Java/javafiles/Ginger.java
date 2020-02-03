package com.example.javafiles;

public class Ginger {

    static Ginger instance=null;
    private Ginger(){
        System.out.println("default constructor");
    }

    private Ginger(int i) {


        System.out.println("Hello this is Ginger" + i);
    }

        public static Ginger getGingerInstance(){

            if(instance == null )
             instance = new Ginger();
            return instance;
    }

    public static void main(String[] args){

       Ginger obj1=getGingerInstance();
       Ginger obj2= getGingerInstance();


        System.out.println(obj2.hashCode());
        System.out.println(obj1.hashCode());
    }

}
