package ru.sergeys.secondapp;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class PublisherGame implements ApplicationContextAware {


    private ApplicationContext context;


    public void publisherGame(int number) {
        context.publishEvent(new GameEvent(number));

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}