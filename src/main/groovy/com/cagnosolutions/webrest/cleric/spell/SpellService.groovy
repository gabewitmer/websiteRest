package com.cagnosolutions.webrest.cleric.spell

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

	Map<String, List<Spell>> findAllOrganized() {
		//def l = new ArrayList<List>(10)
		def m = new TreeMap<String, List<Spell>>()
		def allSpells = repo.findAll();
		allSpells.each { Spell spell ->
			//l.add(spell.level, (l.get(spell.level).size() > 0) ? l.get(spell.level).add(spell) : new ArrayList<Spell>(){{
			//	add(spell)
			//}} as List)

			/*(l.get(spell.level).size() > 0) ? l.get(spell.level).add(spell) : l.add(spell.level, new ArrayList<Spell>(){{
				add(spell)
			}} as List)*/

			m.containsKey(spell.level) ? m.get(spell.level).add(spell) : m.put(spell.level, new ArrayList<Spell>(){{
				add(spell)
			}})

		}
		m
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
