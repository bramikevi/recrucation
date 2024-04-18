package com.solid.di.correct.lower;

import com.solid.di.NotificationService;

// Low-level module - SMSNotificationService
public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        // Implementation to send SMS notification
    }
}