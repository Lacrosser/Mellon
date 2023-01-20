package com.Mellon.podologiaMucche.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="animali")
public class Animale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="orecchino")
	private String orecchino;
	
	@Column(name="data_nascita")
	private Date data_nascita;
	
	@Column(name="identificativo")
	private int identificativo;
	
	@Column(name="ultimo_pareggio")
	private Date ultimo_pareggio;
	
	
	@OneToMany(mappedBy = "animaleId")
	private Set<Patologia> patologia=new HashSet<Patologia>();
	
	
	@JsonIgnore
	@ManyToOne(optional = false)
	@JoinColumn(name="aziende_id")
	private Azienda aziendaId;
	
	
	//Costruttore
	
	public Animale() {
		// TODO Auto-generated constructor stub
	}


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


	public int getIdentificativo() {
		return identificativo;
	}


	public void setIdentificativo(int identificativo) {
		this.identificativo = identificativo;
	}


	public Date getUltimo_pareggio() {
		return ultimo_pareggio;
	}


	public void setUltimo_pareggio(Date ultimo_pareggio) {
		this.ultimo_pareggio = ultimo_pareggio;
	}


	public Set<Patologia> getPatologia() {
		return patologia;
	}


	public void setPatologia(Set<Patologia> patologia) {
		this.patologia = patologia;
	}


	public Azienda getAziendaId() {
		return aziendaId;
	}


	public void setAziendaId(Azienda aziendaId) {
		this.aziendaId = aziendaId;
	}


	

	
	
}