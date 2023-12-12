package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

@Entity
@Table(name="categorie")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategorie;

    @Column(name="nomCategorie", length=255)
    private String nomCategorie;

}
