package com.lore.master.controller;

import com.lore.master.service.AiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoreController {

    private final AiService aiService;

    // We inject the AiService here so the controller can use it
    public LoreController(AiService aiService) {
        this.aiService = aiService;
    }

    // We changed the endpoint from /hello to /ai
    // Now it can take a parameter called 'message'
    @GetMapping("/ai")
    public String askAi(@RequestParam(value = "message", defaultValue = "Hello AI!") String message) {
        // The controller asks the service for the answer
        return aiService.getAiResponse(message);
    }
}