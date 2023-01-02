package ru.sergeys.secondapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

@Slf4j
public class Main implements ApplicationContextAware {

    private ApplicationContext context;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        PublisherGame publisher = context.getBean(PublisherGame.class);
        publisher.publisherGame(new Random().nextInt(1000));


    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}