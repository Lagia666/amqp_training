package fr.lernejo.chat;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Launcher {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Launcher.class);
        RabbitTemplate message = context.getBean(RabbitTemplate.class);

        Scanner sc = new Scanner(System.in);
        String mess;
        do {
            System.out.println("Veuillez rentrer un message : ");
            mess = sc.nextLine();
            message.convertAndSend("chat_messages", mess);
        }
        while (mess.equals("q") != true);
        System.out.println("Vous avez quitté le programme");



    }
}
