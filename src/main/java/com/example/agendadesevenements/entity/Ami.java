package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ami")
public class Ami {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAmi;

    @Column(name = "status", length = 50)
    private String status;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur1;

    public Ami() {
    }

    public Ami(Integer idAmi, String status) {
        this.idAmi = idAmi;
        this.status = status;
    }

    public Ami(String status, Utilisateur utilisateur1) {
        this.status = status;
        this.utilisateur1 = utilisateur1;
    }
    // getters and setters

    public Integer getIdAmi() {
        return idAmi;
    }

    public void setIdAmi(Integer idAmi) {
        this.idAmi = idAmi;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Utilisateur getUtilisateur1() {
        return utilisateur1;
    }
    public void setUtilisateur1(Utilisateur utilisateur1) {
        this.utilisateur1 = utilisateur1;
    }
}
