package com.classwork;

import com.classwork.model.Man;
import com.classwork.model.User;
import com.classwork.model.Woman;

public class Test {
    public static void main(String[] args) {
        User man1 = new Man("man111", "Ashot", "091111111", true,
                "cdbjhdbchjbs", new User.Address("Yerevan", "Baghramyan"));
        User man2 = new Man("man222", "Aram", "092222222", false,
                "ewdfwfer", new User.Address("Yerevan", "Halabyan"));
        User woman1 = new Woman("woman333", "Eva", "077777777", false,
                "htrhytikuy", new User.Address("Yerevan", "Baghramyan"));
        User woman2 = new Woman("woman444", "Anna", "099999999", false,
                "yjsdtrdg", new User.Address("Yerevan", "Baghramyan"));

        User[] users = {man1, man2, woman1, woman2};

        User.serializeUser(man1);

        User u = User.deserializeUser();

        u.printInfo();
    }
}
