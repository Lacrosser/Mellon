package com.Mellon.podologiaMucche.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mellon.podologiaMucche.entities.Animale;
import com.Mellon.podologiaMucche.entities.Patologia;
import com.Mellon.podologiaMucche.services.iservices.AnimaleService;
import com.Mellon.podologiaMucche.services.iservices.PatologiaService;


@RestController
@RequestMapping("api/patologia")
public class PatologiaRest {
	
	@Autowired
	private PatologiaService service;
	
	
	@GetMapping
	public List<Patologia> getAll(){
		
		return service.getAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Patologia> getPatologiaById(@PathVariable("id") int id){

		Patologia s = this.service.getPatologiaById(id);

		if (s != null) {

			// se esiste posso restituire 2 cose, il codice di stato delle richiesta, e
			// l'oggetto desiderato

			return new ResponseEntity<Patologia>(s, HttpStatus.OK);
		} else {

			return new ResponseEntity<Patologia>(new Patologia(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping
	public void addPatologia(@RequestBody Patologia u) {
		
		service.addPatologia(u);
	}
	
	@DeleteMapping("/{id}")
	public void deletePatologia(@PathVariable("id") int id) {
		service.deletePatologiaById(id);
	}
	
	@PutMapping("/{id}")
	public void updatePatologia(@PathVariable int id, @RequestBody Patologia u) {
		
		Patologia s=this.service.getPatologiaById(id);
		
		s.setData(u.getData());
		s.setAnimaleId(u.getAnimaleId());
		s.setId_animale(u.getId_animale());
		s.setMedicazione(u.getMedicazione());
		s.setPatologia(u.getPatologia());
		s.setPosizione(u.getPosizione());
		s.setRivisita(u.getRivisita());
		
		service.updatePatologia(s);
		
	}
	@PutMapping
	public void updatePatologia(@RequestBody Patologia u) {
		service.updatePatologia(u);
	}
	

	
	
}
