package com.Mellon.podologiaMucche.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vacche")
public class Mucche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="orecchino")
	private String orecchino;
	
	@Column(name="data_nascita")
	private Date data_nascita;
	
	@Column(name="id_animale")
	private int id_animale;
	
	@Column(name="ultimo_pareggio")
	private Date ultimo_pareggio;
	
	//Costruttore
	
	public Mucche() {
		
	}
	
	//Getters & setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrecchino() {
		return orecchino;
	}

	public void setOrecchino(String orecchino) {
		this.orecchino = orecchino;
	}

	public Date getData_nascita() {
		return data_nascita;
	}

	public void setData_nascita(Date data_nascita) {
		this.data_nascita = data_nascita;
	}

	public int getId_animale() {
		return id_animale;
	}

	public void setId_animale(int id_animale) {
		this.id_animale = id_animale;
	}

	public Date getUltimo_pareggio() {
		return ultimo_pareggio;
	}

	public void setUltimo_pareggio(Date ultimo_pareggio) {
		this.ultimo_pareggio = ultimo_pareggio;
	}
	
	
	
	
}