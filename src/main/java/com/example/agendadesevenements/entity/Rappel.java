package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rappel")
public class Rappel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRappel;

    @Column(name="duree")
    private Integer duree;

    @Column(name="message", length = 255)
    private String message;

    @ManyToOne
    @JoinColumn(name="id_Evenement")
    private Evenement evenement;

    @ManyToOne
    @JoinColumn(name = "id_Utilisateur")
    private Utilisateur utilisateur;



}
