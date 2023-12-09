package com.example.agendadesevenements.repository;

import com.example.agendadesevenements.entity.Utilisateur;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}

