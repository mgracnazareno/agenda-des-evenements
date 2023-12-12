package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ami")
public class Ami {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAmi; // This should correspond to 'idAmi' AUTO_INCREMENT PRIMARY KEY in your DB

    @Column(name = "status", length = 50)
    private String status;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur") // Ensure this matches the foreign key column in your DB
    private Utilisateur utilisateur1;

    // getters and setters
}
