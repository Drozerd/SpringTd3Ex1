package com.inti.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Acteur {
	
	private long id;
	private String nom;
	private String prenom;
	private String email;
	private String ville;
	
	
	public Acteur() {
		super();
	}


	public Acteur(long id, String nom, String prenom, String email, String ville) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.ville = ville;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	@Override
	public String toString() {
		return "Acteur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", ville=" + ville
				+ "]";
	}
	
	
}
