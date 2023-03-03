package com.plateforme;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.plateforme.model.entities.Utilisateur;
import com.plateforme.services.UtilisateurService;

@SpringBootApplication
public class RepodemoApplication implements CommandLineRunner {

	@Autowired
	UtilisateurService userapi;
	
	public static void main(String[] args) {
		SpringApplication.run(RepodemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello spring");
		Utilisateur us=new Utilisateur(0, "user1", "username1", "user@gmail.com", "userpassword");
		Utilisateur us2=new Utilisateur(0, "user2", "username2", "user2@gmail.com", "userpassword2");
		userapi.createUtilisateur(us);
		userapi.createUtilisateur(us2);
		/*userapi.showUtilisateurs().forEach(user->{
			System.out.println(user.toString());
		});
		us2.setNom("khalil");
		us2.setId(2);
		userapi.createUtilisateur(us2);
List<Utilisateur> users3=userapi.findByNom("khalil");
users3.forEach(users->{
	System.out.println("user found by name: "+users);
});
*/
	Optional<Utilisateur> user=userapi.authentifier( "user@gmail.com", "userpassword");
	if(user.isEmpty())
		System.out.println("no user found");
	else
	System.out.println(user.toString());
	}

}
