package com.example.javafiles;

public abstract class KapilAdvWatch extends KapilWatch{

    @Override
    public void playMusic() {
        System.out.println("Playing music!!!!");
    }

    @Override
    public void showWeather() {
        System.out.println("Today's weather is Sunny");
    }


    public abstract void sendMessage();
}
