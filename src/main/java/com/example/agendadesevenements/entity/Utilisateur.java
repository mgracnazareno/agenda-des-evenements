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
    @Column(name ="idUtilisateur" )
    private Integer id;

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

    @OneToMany(mappedBy ="utilisateur")
    private Set<Rappel> rappel;  //each utilisateur can have multiple reminders

    @ManyToMany
    @JoinTable(
            name = "ami",
            joinColumns = @JoinColumn(name = "idUtilisateur"),
            inverseJoinColumns = @JoinColumn(name = "idAmi")
    )
    private List<Utilisateur> amis;  // List of friends

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Rappel> getRappel() {
        return rappel;
    }

    public void setRappel(Set<Rappel> rappel) {
        this.rappel = rappel;
    }

    public List<Utilisateur> getAmis() {
        return amis;
    }

    public void setAmis(List<Utilisateur> amis) {
        this.amis = amis;
    }
}


