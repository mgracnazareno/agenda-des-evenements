package com.example.agendadesevenements.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EntrepreneurController {
    @GetMapping("/entrepreneur")
    public String pageEntrepreneur(){
        return "entrepreneur";
    }
}
