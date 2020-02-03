package com.example.javafiles;

public class KapilEpicWatch extends KapilAdvWatch{

    @Override
    public void showHearRate() {
        System.out.println("Your Heart rate is 150bpm");
    }

    @Override
    public void playMusic() {
        System.out.println("new Music playing");
    }

    @Override
    public void sendMessage() {
        System.out.println("Message Sent!!!");
    }
}
