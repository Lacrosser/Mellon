package com.Mellon.podologiaMucche.entities;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "aziende")
public class Azienda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="codice_azienda")
	private String codice;
	
	@Column(name="nome")
	private String nome;
	
	
	@OneToMany(mappedBy = "aziendaId")
	private Set<Animale> animale=new HashSet<Animale>();
	
	public Azienda() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Animale> getAnimale() {
		return animale;
	}

	public void setAnimale(Set<Animale> animale) {
		this.animale = animale;
	}
	
	
}
