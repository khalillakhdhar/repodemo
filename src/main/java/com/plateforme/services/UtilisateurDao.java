package com.plateforme.services;

import java.util.List;

import com.plateforme.model.entities.Utilisateur;

public interface UtilisateurDao {
public Utilisateur createUtilisateur(Utilisateur utilisateur);
public List<Utilisateur> showUtilisateurs();
public Utilisateur findOneUtilisateur(long id);
public void deleteOneUtilisateur(long id);
public List<Utilisateur> findByNom(String nom);
}

