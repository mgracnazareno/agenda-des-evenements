package com.example.agendadesevenements;

import com.example.agendadesevenements.entity.Utilisateur;
import com.example.agendadesevenements.repository.UtilisateurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AgendaDesEvenementsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgendaDesEvenementsApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(){
//        return runner -> {
//            System.out.println("Hello User");
//        };
//    }

}
