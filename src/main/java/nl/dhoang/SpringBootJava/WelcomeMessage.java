package nl.dhoang.SpringBootJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelcomeMessage {

    public static void main(String[] args) {
        SpringApplication.run(WelcomeMessage.class, args);

        var welcomeMessage = new WelcomeMessage();

        /// The below shouldn't work given the structure of your classes here and it is not at root
//        System.out.println(welcomeMessage.getWelcomeMessage);
    }

}
