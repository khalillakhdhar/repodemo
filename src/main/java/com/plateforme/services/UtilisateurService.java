package com.plateforme.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plateforme.model.entities.Utilisateur;
import com.plateforme.model.repositories.UtilisateurRepository;

@Service
public class UtilisateurService implements UtilisateurDao {

	@Autowired
	//la repo est automatiquement initialisé
	UtilisateurRepository utilisateurRepository;
	
	@Override
	public Utilisateur createUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public List<Utilisateur> showUtilisateurs() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur findOneUtilisateur(long id) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findById(id).get();
	}

	@Override
	public void deleteOneUtilisateur(long id) {
		// TODO Auto-generated method stub
		utilisateurRepository.deleteById(id);
		
	}

	@Override
	public List<Utilisateur> findByNom(String nom) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findByNom(nom);
	}

	@Override
	public Optional<Utilisateur> authentifier(String email, String password) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findByEmailAndPassword(email, password);
	}

}
