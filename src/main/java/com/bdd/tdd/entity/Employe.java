package com.bdd.tdd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employe {
	@Id
	@GeneratedValue
	public Long id;
	public String nom;
	public String prenom;
	public String matricule;
	public String adresse;

	public Employe() {
		super();
	}

	public Employe(String nom, String prenom, String matricule, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.adresse = adresse;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
