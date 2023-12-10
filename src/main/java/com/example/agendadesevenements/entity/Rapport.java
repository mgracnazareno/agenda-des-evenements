package com.example.agendadesevenements.entity;

import jakarta.persistence.*;
import jdk.jshell.execution.Util;

import java.util.Date;

@Entity
@Table(name="rapports")
public class Rapport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name="description")
    private String raison;

    @Column(name="dateRapport")
    @Temporal(TemporalType.DATE)  //specify Date format
    private Date dateRapport;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur; //the use associated with this report

    @ManyToOne
    @JoinColumn(name="idAdmin")
    private Administrateur administrateur; //the admin managing the report


}
