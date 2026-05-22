package dev.alita.solid.service.notification;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService  implements EmailSender {

    @Override
    public void sendEmail(String email, String message) {
        // Simulate sending an email
        System.out.println("Sending email to " + email + ": " + message);
    }
}
