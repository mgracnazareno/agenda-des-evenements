package com.example.agendadesevenements.service;

import com.example.agendadesevenements.entity.Utilisateur;

import java.util.List;

public interface UtilisateurService {

    List<Utilisateur> findAll();

    Utilisateur findById(int idUtilisateur);

    Utilisateur save(Utilisateur utilisateur);
}
