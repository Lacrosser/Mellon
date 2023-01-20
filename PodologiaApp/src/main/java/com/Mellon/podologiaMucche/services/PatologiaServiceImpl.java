package com.Mellon.podologiaMucche.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Mellon.podologiaMucche.entities.Patologia;
import com.Mellon.podologiaMucche.repo.PatologiaDao;
import com.Mellon.podologiaMucche.services.iservices.PatologiaService;

public class PatologiaServiceImpl implements PatologiaService {
	
	@Autowired
	private PatologiaDao repo;
	
	@Override
	public List<Patologia> getAll() {
		return repo.findAll();
	}

	@Override
	public Patologia getPatologiaById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void addPatologia(Patologia u) {
		repo.save(u);

	}

	@Override
	public void deletePatologiaById(int id) {
		repo.deleteById(id);

	}

	@Override
	public void updatePatologia(Patologia u) {
		repo.save(u);

	}

}
