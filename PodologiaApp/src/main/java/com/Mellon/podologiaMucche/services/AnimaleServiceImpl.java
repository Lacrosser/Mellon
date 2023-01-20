package com.Mellon.podologiaMucche.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Mellon.podologiaMucche.entities.Animale;
import com.Mellon.podologiaMucche.repo.AnimaleDao;
import com.Mellon.podologiaMucche.services.iservices.AnimaleService;

public class AnimaleServiceImpl implements AnimaleService {
	
	@Autowired
	private AnimaleDao repo;

	@Override
	public List<Animale> getAll() {
		return repo.findAll();
	}

	@Override
	public Animale getAnimaleById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void addAnimale(Animale u) {
		repo.save(u);
		
	}

	@Override
	public void deleteAnimaleById(int id) {
		repo.deleteById(id);
	}

	@Override
	public void updateAnimale(Animale u) {
		repo.save(u);
	}

}
