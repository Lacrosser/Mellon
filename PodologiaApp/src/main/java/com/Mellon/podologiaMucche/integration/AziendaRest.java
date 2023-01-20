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

import com.Mellon.podologiaMucche.entities.Azienda;
import com.Mellon.podologiaMucche.services.iservices.AziendaService;

@RestController
@RequestMapping("api/azienda")
public class AziendaRest {
	
	@Autowired
	private AziendaService service;
	
	
	@GetMapping
	public List<Azienda> getAll(){
		
		return service.getAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Azienda> getAziendaById(@PathVariable("id") int id){

		Azienda s = this.service.getAziendaById(id);

		if (s != null) {

			// se esiste posso restituire 2 cose, il codice di stato delle richiesta, e
			// l'oggetto desiderato

			return new ResponseEntity<Azienda>(s, HttpStatus.OK);
		} else {

			return new ResponseEntity<Azienda>(new Azienda(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping
	public void addAzienda(@RequestBody Azienda u) {
		
		service.addAzienda(u);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAzienda(@PathVariable("id") int id) {
		service.deleteAziendaById(id);
	}
	
	@PutMapping("/{id}")
	public void updateAzienda(@PathVariable int id, @RequestBody Azienda u) {
		
		Azienda s=this.service.getAziendaById(id);
		
		s.setCodice(u.getCodice());
		s.setAnimale(u.getAnimale());
		s.setNome(u.getNome());
		
		service.updateAzienda(s);
		
	}
	@PutMapping
	public void updateAzienda(@RequestBody Azienda u) {
		service.updateAzienda(u);
	}
	

	
	
}
