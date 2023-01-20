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
import com.Mellon.podologiaMucche.services.iservices.AnimaleService;


@RestController
@RequestMapping("api/animali")
public class AnimaliRest {
	
	@Autowired
	private AnimaleService service;
	
	
	@GetMapping
	public List<Animale> getAll(){
		
		return service.getAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Animale> getAnimaleById(@PathVariable("id") int id){

		Animale s = this.service.getAnimaleById(id);

		if (s != null) {

			// se esiste posso restituire 2 cose, il codice di stato delle richiesta, e
			// l'oggetto desiderato

			return new ResponseEntity<Animale>(s, HttpStatus.OK);
		} else {

			return new ResponseEntity<Animale>(new Animale(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping
	public void addAnimale(@RequestBody Animale u) {
		
		service.addAnimale(u);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAnimale(@PathVariable("id") int id) {
		service.deleteAnimaleById(id);
	}
	
	@PutMapping("/{id}")
	public void updateAnimale(@PathVariable int id, @RequestBody Animale u) {
		
		Animale s=this.service.getAnimaleById(id);
		
		s.setAziendaId(u.getAziendaId());
		s.setData_nascita(u.getData_nascita());
		s.setId_animale(u.getId_animale());
		s.setOrecchino(u.getOrecchino());
		s.setPatologia(u.getPatologia());
		s.setUltimo_pareggio(u.getUltimo_pareggio());
		
		service.updateAnimale(s);
		
	}
	@PutMapping
	public void updateAnimale(@RequestBody Animale u) {
		service.updateAnimale(u);
	}
	

	
	
}
