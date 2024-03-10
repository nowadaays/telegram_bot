package org.nowadays;

import com.pengrad.telegrambot.model.Update;

public class LogService {
    public void log(Update update){
        String username = update.message().from().username() != null ? update.message().from().username() : "";
        System.out.println("-------------------------------");
        System.out.println("New Messege");
        System.out.println("username: " + username);
        System.out.println("text: " + update.message().text());
        System.out.println("-------------------------------");
    }
}
