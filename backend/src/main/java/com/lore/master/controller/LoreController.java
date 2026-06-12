package com.lore.master.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoreController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to Lore Master! Your RAG backend is officially online.";
    }
}