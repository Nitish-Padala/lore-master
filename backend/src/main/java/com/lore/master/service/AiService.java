package com.lore.master.service;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private final OllamaChatModel chatModel;

    // This is called "Constructor Injection"
    public AiService(OllamaChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String getAiResponse(String prompt) {
        // This sends the text to Ollama and returns the generated answer
        return chatModel.call(prompt);
    }
}