package com.Mellon.podologiaMucche.entities;
import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="zoppie")
public class Zoppia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="data")
	@CreationTimestamp
	private Date data;
	
	@Column(name="id_animale")
	private int id_animale;
	
	@Column(name="medicazione")
	private String medicazione;
	
	@Column(name="patologia")
	private String patologia;
	
	@Column(name="posizione")
	private String posizione;
	
	@Column(name="rivisita")
	private String rivisita;
	
	
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "mucche_id")
	private Mucca muccaId;
	
	

	//Costruttore
	
	public Zoppia() {
		
	}
	
	//getters & setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getId_animale() {
		return id_animale;
	}

	public void setId_animale(int id_animale) {
		this.id_animale = id_animale;
	}

	public String getMedicazione() {
		return medicazione;
	}

	public void setMedicazione(String medicazione) {
		this.medicazione = medicazione;
	}

	public String getPatologia() {
		return patologia;
	}

	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}

	public String getPosizione() {
		return posizione;
	}

	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}

	public String getRivisita() {
		return rivisita;
	}

	public void setRivisita(String rivisita) {
		this.rivisita = rivisita;
	}
	
	
	
	
}