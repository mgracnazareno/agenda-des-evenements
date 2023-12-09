package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

@Entity
@Table(name="notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNotification;

    @ManyToOne
    @JoinColumn(name="id_Evenement")
    private Evenement evenement;

    @ManyToOne
    @JoinColumn(name="id_Utilisateur")
    private Utilisateur utilisateur;


}
