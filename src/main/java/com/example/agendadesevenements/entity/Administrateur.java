package com.example.agendadesevenements.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "administrateur")
public class Administrateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdmin; // This should correspond to 'idAdmin' AUTO_INCREMENT PRIMARY KEY in your DB

    @ManyToOne
    @JoinColumn(name = "idUtilisateur") // Ensure this matches the foreign key column in your DB
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "idEvenement") // Ensure this matches the foreign key column in your DB
    private Evenement evenement;

    @OneToMany(mappedBy = "administrateur", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rapport> rapports;

    public Administrateur() {
    }

    public Administrateur(Utilisateur utilisateur, Evenement evenement) {
        this.utilisateur = utilisateur;
        this.evenement = evenement;
    }

    public Administrateur(Integer idAdmin, Utilisateur utilisateur, Evenement evenement) {
        this.idAdmin = idAdmin;
        this.utilisateur = utilisateur;
        this.evenement = evenement;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }

    public List<Rapport> getRapports() {
        return rapports;
    }

    public void setRapports(List<Rapport> rapports) {
        this.rapports = rapports;
    }
}
