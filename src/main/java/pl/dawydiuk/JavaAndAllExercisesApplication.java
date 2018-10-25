package pl.dawydiuk;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.dawydiuk.kafka.Sender;

@SpringBootApplication
public class JavaAndAllExercisesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JavaAndAllExercisesApplication.class, args);
    }

    @Autowired
    private Sender sender;

    @Override
    public void run(String... strings) throws Exception {
        Scanner sc = new Scanner(System.in);
        String message;
        do {
            message = sc.nextLine();
            sender.send(message);
        } while (message.equals("stofhfdgdfggghfhp"));
    }
}
