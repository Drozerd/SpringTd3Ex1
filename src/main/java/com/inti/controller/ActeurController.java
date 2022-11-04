package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inti.model.Acteur;
import com.inti.service.ActeurRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping ("acteur")
@Slf4j
public class ActeurController {

	@Autowired
	ActeurRepository ary;
	
	@GetMapping("/Acteurs")
	public List<Acteur> getActeurs()
	{
		log.info("Liste de tous les acteurs");
		return ary.findAll();
	}
	
	@PostMapping("saveActeur")
	public boolean saveActeur (@RequestBody Acteur a) 
	{
		if (a.getId() > 0) 
		{
			log.info("L'acteur a été enregistré");
			ary.save(a);
			return true;
		}
		log.error("L'acteur n'a pas été enregistré");
		return false;
	}
	
	@GetMapping("/getActeur")
	public Acteur getActeur (@PathVariable long id) 
	{
		try {
		return ary.findById(id).get();
		}catch (Exception e) {
			e.printStackTrace();			
		}
		return null;
	}
		
	@DeleteMapping("/deleteActeur/{id}")
	public boolean deleteActeur (@PathVariable long id) 
	{
		if (id != 0) 
		{
		ary.deleteById(id);
		return true;
	}
		return false;
		
	}
	
	@GetMapping("/countActeur")
	
	public int getActorCount() 
	{
		return ary.getActorCount();
	}
	
	@GetMapping("/ChangeNameActeur")
	public void updateActeur (@RequestParam String nom,@RequestParam int id) 
	{
		ary.changeName(nom, id);
	}
}
