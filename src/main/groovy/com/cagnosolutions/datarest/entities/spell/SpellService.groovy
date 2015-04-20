package com.cagnosolutions.datarest.entities.spell

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@CompileStatic
@Service
class SpellService {
	
	@Autowired
	SpellRepository repo
	
	List<Spell> findAll() {
		repo.findAll()
	}
	
	Spell findOne(Integer id) {
		repo.findOne(id)
	}
	
	Spell save(Spell spell) {
		repo.save(spell)
	}
	
	def delete(Integer id) {
		repo.delete(id)
	}
}
