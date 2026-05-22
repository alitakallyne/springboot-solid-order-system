package dev.alita.solid.service.notification;

public interface EmailSender {

    void sendEmail(String email, String message);
}
