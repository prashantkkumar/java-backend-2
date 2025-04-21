package org.example.practice;

import org.example.practice.Model.User;
import org.example.practice.Repository.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(PracticeApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);

    }

}
