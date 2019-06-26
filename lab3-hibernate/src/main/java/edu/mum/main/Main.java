package edu.mum.main;


import edu.mum.domain.User;
import edu.mum.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("context/applicationContext.xml");
        UserService userService = context.getBean(UserService.class);

        User user = new User("John", "Doe", "johndoe@gmail.com", 5, true, 1, new Date());

        userService.save(user);

        System.out.println("********** User **********");

        User userFound = userService.findByEmail("johndoe@gmail.com");
        System.out.println(userFound);

        user.setFirstName("Bucky");
        userService.update(user);
        System.out.println(userService.findByEmail("johndoe@gmail.com"));
    }
}