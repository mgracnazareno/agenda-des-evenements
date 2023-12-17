package com.example.agendadesevenements.repository;

import com.example.agendadesevenements.entity.Utilisateur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {
    @Query("SELECT u  FROM Utilisateur u WHERE u.courriel = :courriel")
    public Utilisateur getUtilisateurByEmail(@Param("courriel") String courriel);

    @Query("SELECT u FROM Utilisateur u WHERE u.courriel = :courriel AND u.motPasse = :motPasse" )
    public Utilisateur getUtilisateurByEmailAndPassword(@Param("courriel") String courriel, @Param("password") String password);

    @Query("Select u From Utilisateur u WHERE u.nom LIKE %?1% or u.prenom LIKE %?1%")
    public List<Utilisateur> findAll(String keyword);





}

