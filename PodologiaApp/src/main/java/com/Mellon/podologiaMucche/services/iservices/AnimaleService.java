package com.Mellon.podologiaMucche.services.iservices;

import java.util.List;

import com.Mellon.podologiaMucche.entities.Animale;

public interface AnimaleService {
	
	List<Animale>getAll();
	
	Animale getAnimaleById(int id);
	void addAnimale(Animale u);
	void deleteAnimaleById(int id);
	void updateAnimale(Animale u);

}
