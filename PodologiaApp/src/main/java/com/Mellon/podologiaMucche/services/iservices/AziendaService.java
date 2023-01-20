package com.Mellon.podologiaMucche.services.iservices;

import java.util.List;
import com.Mellon.podologiaMucche.entities.Azienda;

public interface AziendaService {

	List<Azienda> getAll();
	
	Azienda getAziendaById(int id);
	void addAzienda(Azienda u);
	void deleteAziendaById(int id);
	void updateAzienda(Azienda u);

}
