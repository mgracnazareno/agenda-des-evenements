package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idUtilisateur" )
    private Long Id;

    @Column(name = "nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="courriel")
    private String courriel;

    @Column(name="motPasse")
    private String motPasse;

    @Column(name="photo")
    private String photo;

    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rappel> rappel;

    @ManyToMany
    @JoinTable(
            name = "ami",
            joinColumns = @JoinColumn(name = "idUtilisateur"),
            inverseJoinColumns = @JoinColumn(name = "idAmi")
    )
    private List<Utilisateur> amis;  // List of friends

}
