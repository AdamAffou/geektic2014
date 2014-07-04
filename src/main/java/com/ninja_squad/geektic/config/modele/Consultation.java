package com.ninja_squad.geektic.config.modele;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CONSULTATION")
public class Consultation
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="my_entity_seq_gen")
	@SequenceGenerator(name="my_entity_seq_gen", sequenceName="MY_ENTITY_SEQ")
    @Column(name="ID")
	private int id;
	
	@Column(name="ADRESSEIP")
	private String adresseIp;
	
	@Column(name="IDGEEK")
	private int idGeek;
	


	@Column(name="DATE")
	private Date dateConsultation;
	

	public Consultation(String adresseIp, int idGeek, Date dateConsultation) {

		this.adresseIp = adresseIp;
		this.idGeek = idGeek;
		this.dateConsultation = dateConsultation;
	}
}
