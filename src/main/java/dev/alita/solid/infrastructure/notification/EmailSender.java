package dev.alita.solid.infrastructure.notification;

public interface EmailSender {

    void sendEmail(String email, String message);
}
