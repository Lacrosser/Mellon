package com.Mellon.podologiaMucche.services.iservices;

import java.util.List;
import com.Mellon.podologiaMucche.entities.Patologia;

public interface PatologiaService {
	
	List<Patologia> getAll();
	
	Patologia getPatologiaById(int id);
	void addPatologia(Patologia u);
	void deletePatologiaById(int id);
	void updatePatologia(Patologia u);

}
