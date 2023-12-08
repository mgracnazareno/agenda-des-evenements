package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="evenement")
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEvenement")
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
    @JoinColumn(name="idUtilisateur")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name="idEntreprise")
    private Entreprise entreprise;

    @ManyToOne
    @JoinColumn(name="idLocation")
    private Location address;

    @ManyToOne
    @JoinColumn(name="idCategorie")
    private Categorie categorie;


}
