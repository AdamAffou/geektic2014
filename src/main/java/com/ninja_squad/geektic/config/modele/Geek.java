package com.ninja_squad.geektic.config.modele;

import java.util.Set;

import javax.persistence.*;


@Entity
@SequenceGenerator(name="id",sequenceName="geek_seq")
@Table(name="GEEK")
public class Geek {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id")
    @Column(name="ID")
	private int id;
    
    @Column(name="NOM")
    private String nom;

    @Column(name="PRENOM")
    private String prenom;
    
    @Column(name="MAIL")
    private String mail;
    
    @Column(name="GRAVATAR")
    private String urlGravatar;
    
    @ManyToMany
    @JoinTable(name = "GEEK_INTERET",
               joinColumns = @JoinColumn(name = "IDGEEK"),
               inverseJoinColumns = @JoinColumn(name = "IDINTERET"))
    private Set<Interet> interets;

    public Geek()
    {}
	public Geek( String nom, String prenom, String mail,String urlGravatar) 
	{

		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.urlGravatar = urlGravatar;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getUrlGravatar() {
		return urlGravatar;
	}

	public void setUrlGravatar(String urlGravatar) {
		this.urlGravatar = urlGravatar;
	}
    
    
}