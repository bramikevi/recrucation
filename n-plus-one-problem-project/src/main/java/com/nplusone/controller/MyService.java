package com.nplusone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyService {
    @Value("${backend.url}")
    private String redirectUrl;

    public String getRedirectUrl() {
        return redirectUrl;
    }
}
