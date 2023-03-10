package com.plateforme.model.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.plateforme.model.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
List<Utilisateur> findByNom(String nom);
Optional<Utilisateur> findByEmailAndPassword(String email,String password);

}
