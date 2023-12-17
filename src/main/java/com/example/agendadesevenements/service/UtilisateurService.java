package com.example.agendadesevenements.service;

import com.example.agendadesevenements.entity.Utilisateur;
import com.example.agendadesevenements.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.event.MouseInputListener;
import java.util.List;
@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository repo;

    public List<Utilisateur> afficherUtilisateurs(){
        return (List<Utilisateur>) repo.findAll();
    }

}
