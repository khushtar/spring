package com.springweb.demo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

    // defining private string of array
    private final String[] randomFortune = {"Good luck!", "Hard Day!", "Enjoy!"};

    @Override
    public String getFortune() {
        int random = new Random().nextInt(3);
        return randomFortune[random];
    }
}
