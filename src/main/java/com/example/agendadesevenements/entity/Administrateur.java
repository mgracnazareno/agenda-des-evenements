package com.example.agendadesevenements.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="administrateur")
public class Administrateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdmin;

    @ManyToOne
    @JoinColumn(name="id_Utilisateur")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name="id_evenement")
    private Evenement evenement;

    @OneToMany(mappedBy = "administrateur", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rapport> rapports;
}
