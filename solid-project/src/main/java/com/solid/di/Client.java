package com.solid.di;

// High-level module - Client code
public class Client {
    private final NotificationService notificationService;

    public Client(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void doSomethingAndNotify(String message) {
        // Do something...
        notificationService.sendNotification(message);
    }
}