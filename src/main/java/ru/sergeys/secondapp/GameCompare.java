package ru.sergeys.secondapp;

import org.springframework.beans.BeansException;
import org.springframework.context.*;
import java.util.Locale;
import java.util.Scanner;


public class GameCompare implements ApplicationListener<GameEvent>, ApplicationContextAware {


    ApplicationContext context;

    @Override
    public void onApplicationEvent(GameEvent event) {
        Locale locale = Locale.getDefault();

        System.out.println(context.getMessage("hello", null,Locale.US));
        System.out.println(context.getMessage("tryInput", null, Locale.US));
        Scanner sc = new Scanner(System.in);
        long enterNumber = sc.nextInt();
        while (enterNumber != event.getRandomNumber()) {
            if (enterNumber > event.getRandomNumber()) {
                System.out.println(context.getMessage("lower", null, Locale.US));
            } else {
                System.out.println(context.getMessage("higher", null, Locale.US));
            }
            enterNumber = sc.nextInt();
        }
        System.out.println(context.getMessage("congrats", null, Locale.US) + event.getRandomNumber());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}


