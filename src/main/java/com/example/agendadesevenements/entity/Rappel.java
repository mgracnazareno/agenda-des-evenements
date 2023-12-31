package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rappel")
public class Rappel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRappel;

    @Column(name="duree")
    private Integer duree;

    @Column(name="message", length = 255)
    private String message;

    @ManyToOne
    @JoinColumn(name="idEvenement")
    private Evenement evenement;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;



}
