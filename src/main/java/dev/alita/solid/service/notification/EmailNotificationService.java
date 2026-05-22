package dev.alita.solid.service.notification;

import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService {

    public void sendEmail(String email, String message) {
        
        System.out.println("Enviando email para " + email + ": " + message);
    }
}
