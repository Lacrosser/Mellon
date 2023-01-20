package com.Mellon.podologiaMucche.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Mellon.podologiaMucche.entities.Azienda;
import com.Mellon.podologiaMucche.repo.AziendaDao;
import com.Mellon.podologiaMucche.services.iservices.AziendaService;

public class AziendaServiceImpl implements AziendaService {

	@Autowired
	private AziendaDao repo;
	
	@Override
	public List<Azienda> getAll() {
		return repo.findAll();
	}

	@Override
	public Azienda getAziendaById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void addAzienda(Azienda u) {
		repo.save(u);
		
	}

	@Override
	public void deleteAziendaById(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public void updateAzienda(Azienda u) {
		repo.save(u);
		
	}

}
