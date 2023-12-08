package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "entreprise")
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEntreprise")
    private Long idEntreprise;

    @Column(name="nomEntreprise")
    private String nomEntreprise;

    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name="idUtilisateur" )
    private Utilisateur idUtilisateur;

    @ManyToOne
    @JoinColumn(name="idLocation")
    private Location idLocation;


}
