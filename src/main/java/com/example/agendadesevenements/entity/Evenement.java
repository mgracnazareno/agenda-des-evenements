package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="evenement")
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Evenement")
    private Long idEvenement;

    @Column(name="titre")
    private String titre;

    @Column(name="date")
    private Date date;

    @Column(name ="heureDebut")
    private String heureDebut;

    @Column(name="heureFin")
    private String heureFin;

    @Column(name="commentaire")
    private String commentaire;

    @Column(name="photoEvent")
    private String photoEvent;

    @ManyToOne
    @JoinColumn(name="id_Utilisateur")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name="id_Entreprise")
    private Entreprise entreprise;

    @ManyToOne
    @JoinColumn(name="id_Location")
    private Location address;

    @ManyToOne
    @JoinColumn(name="id_Categorie")
    private Categorie categorie;


}
