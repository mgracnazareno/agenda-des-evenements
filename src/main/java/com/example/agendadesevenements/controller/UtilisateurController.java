package com.example.agendadesevenements.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UtilisateurController {

    @GetMapping("/homepage")
    public String pageAcceuil(){
        return "homepage";
    }

    @GetMapping("/acc")
    public String acceuilpage(){
        return "acceuil";
    }


    @GetMapping("/list-event")
    public String listEvents(Model model){
        //get all the events from db

        //add list of events to the model

        return "list-evenement";
    }
    @GetMapping("/login")
    public String pageLogin(){
        return "login";
    }
    @GetMapping("/event")
    public String pageDetailsEvenement(){
        return "detail-evenement";
    }

    @GetMapping("/profil")
    public String pageProfil(){
        return "profil";
    }

}
