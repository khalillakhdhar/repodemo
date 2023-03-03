package com.plateforme.services;

import java.util.List;
import java.util.Optional;

import com.plateforme.model.entities.Utilisateur;

public interface UtilisateurDao {
public Utilisateur createUtilisateur(Utilisateur utilisateur);
public List<Utilisateur> showUtilisateurs();
public Utilisateur findOneUtilisateur(long id);
public void deleteOneUtilisateur(long id);
public List<Utilisateur> findByNom(String nom);
public Optional<Utilisateur> authentifier(String email,String password);

}

