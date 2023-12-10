package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

@Entity
@Table(name="notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNotification;

    @ManyToOne
    @JoinColumn(name="idEvenement")
    private Evenement evenement;

    @ManyToOne
    @JoinColumn(name="idUtilisateur")
    private Utilisateur utilisateur;


}
