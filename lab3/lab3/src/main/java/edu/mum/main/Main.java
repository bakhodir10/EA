package edu.mum.main;


import edu.mum.domain.User;
import edu.mum.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("context/applicationContext.xml");
        UserService userService = context.getBean(UserService.class);

        User user1 = new User("John", "Doe", "johndoe@gmail.com", 5, true, 1, new Date());
        User user2 = new User("Bakhodir", "Boydedaev", "bakhodir@gmail.com", 5, true, 1, new Date());
        userService.save(user1);
        userService.save(user2);

        List<User> users = userService.findAll();
        System.out.println("********** User **********");

        for (User user : users) {
            if (user.getEmail().equals("johndoe@gmail.com")) {
                System.out.println("User name: " + user.getName());
            }
        }
    }
}