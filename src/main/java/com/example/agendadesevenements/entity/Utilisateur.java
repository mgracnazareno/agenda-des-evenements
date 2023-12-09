package com.example.agendadesevenements.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name="utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_Utilisateur" )
    private Long Id;

    @Column(name = "nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="courriel")
    private String courriel;

    @Column(name="motPasse")
    private String motPasse;

    @Getter
    @Column(name="photo")
    private String photo;

    private String type;

    @OneToMany(mappedBy = "utilisateur")
    private Set<Rappel> rappel;  //each utilisateur can have multiple reminders

    @ManyToMany
    @JoinTable(
            name = "ami",
            joinColumns = @JoinColumn(name = "id_Utilisateur"),
            inverseJoinColumns = @JoinColumn(name = "idAmi")
    )
    private List<Utilisateur> amis;  // List of friends


}


