package com.example.javafiles;

import java.time.LocalDate;

public abstract class KapilWatch {

    public void showTime(){

        LocalDate ld=LocalDate.now();
        System.out.println(" the time is " + ld );

    }
    public void showHearRate(){
        System.out.println("heart Rate");
    }

    public abstract void playMusic();
    public abstract void showWeather();




}
