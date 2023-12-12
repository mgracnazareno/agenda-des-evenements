package com.example.agendadesevenements.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "administrateur")
public class Administrateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdmin; // This should correspond to 'idAdmin' AUTO_INCREMENT PRIMARY KEY in your DB

    @ManyToOne
    @JoinColumn(name = "idUtilisateur") // Ensure this matches the foreign key column in your DB
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "idEvenement") // Ensure this matches the foreign key column in your DB
    private Evenement evenement;

    @OneToMany(mappedBy = "administrateur", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rapport> rapports;
}
