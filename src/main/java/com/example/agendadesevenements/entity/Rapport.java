package com.example.agendadesevenements.entity;

import jakarta.persistence.*;
import jdk.jshell.execution.Util;

import java.util.Date;

@Entity
@Table(name="rapport")
public class Rapport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="description")
    private String raison;

    @Column(name="dateRapport")
    @Temporal(TemporalType.DATE)  //specify Date format
    private Date dateRapport;

    @ManyToOne
    @JoinColumn(name = "id_Utilisateur")
    private Utilisateur utilisateur; //the use associated with this report

    @ManyToOne
    @JoinColumn(name="id_Admin")
    private Administrateur administrateur; //the admin managing the report


}
