package com.example.agendadesevenements.controller;

import com.example.agendadesevenements.entity.Utilisateur;
import com.example.agendadesevenements.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UtilisateurController {

    private UtilisateurService utilisateurService;

    @Autowired
    public UtilisateurController(UtilisateurService utilService){
        utilisateurService = utilService;
    }

    //add mapping
    @GetMapping("/listUtilisateur")
    public String listUtilisateur(Model model){
        //get the utilisateur from db
        List<Utilisateur> listUtilisateurs = utilisateurService.findAll();
        //add to the spring model
        return "profil";
    }

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

    @GetMapping("/entrepreneur")
    public String pageEntrepreneur(){
        return "entrepreneur";
    }

}
