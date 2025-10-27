package com.rpi.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ChatController {

    private final SimpMessagingTemplate messagingTemplate;

    public ChatController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @GetMapping("/")
    public String chatPage() {
        return "chat";
    }

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public Map<String, String> handleChatMessage(@Payload Map<String, String> message) {
        String messageContent = message.get("content");

        Map<String, String> response = new HashMap<>();
        response.put("content", messageContent);

        return response;
    }
}
