package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

@Entity
@Table(name="ami")
public class Ami {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAmi;

    @Column(name="status")
    private String status;

    @ManyToOne
    @JoinColumn(name="idUtilisateur")
    private Utilisateur utilisateur1;

    @ManyToOne
    @JoinColumn(name="idUtilisateur")
    private Utilisateur utilisateur2;


}
