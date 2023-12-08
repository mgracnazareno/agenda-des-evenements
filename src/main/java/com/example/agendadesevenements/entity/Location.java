package com.example.agendadesevenements.entity;

import jakarta.persistence.*;

@Entity
@Table(name="location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="rue")
    private String rue;

    @Column(name="ville")
    private String ville;

    @Column(name="pays")
    private String pays;

    @Column(name="postalCode")
    private String postalCode;

}
