package com.solid.di.correct.lower;

import com.solid.di.NotificationService;

// Low-level module - EmailNotificationService
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        // Implementation to send email notification
    }
}