package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="administrateur")
public class Administrateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdmin;

    @ManyToOne
    @JoinColumn(name="idUtilisateur")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name="evenement")
    private Evenement evenement;

    @OneToMany(mappedBy = "administrateur", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rapport> rapports;
}
