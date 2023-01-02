package ru.sergeys.secondapp;

import org.springframework.context.ApplicationEvent;

public class GameEvent extends ApplicationEvent {


    private long randomNumber;


    public GameEvent(long randomNumber) {
        super(randomNumber);
        this.randomNumber = randomNumber;
    }

    public long getRandomNumber() {
        return randomNumber;
    }

}