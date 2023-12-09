package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "entreprise")
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Entreprise")
    private Long idEntreprise;

    @Column(name="nomEntreprise")
    private String nomEntreprise;

    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name="id_Utilisateur" )
    private Utilisateur idUtilisateur;

    @ManyToOne
    @JoinColumn(name="id_Location")
    private Location idLocation;

}
