package com.notification.notification.message.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notification")
public class MessageController {
    @GetMapping("sent-message")
    public String sentMessage() {
        return "Welcome Message";
    }
}
