package com.cagnosolutions.datarest.entities.spell

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
/**
 * Created by greg on 2/12/15.
 */

@CompileStatic
@RestController
@RequestMapping("/spell")
class SpellController {
	
	@Autowired
	SpellService spellService
	
	@RequestMapping(method = RequestMethod.GET)
	List<Spell> findAllSpells() {
		spellService.findAll()
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	Spell findOneSpell(@PathVariable Integer id) {
		spellService.findOne(id)
	}
	
	@RequestMapping(method = RequestMethod.POST)
	Spell addSpell(@RequestBody Spell spell) {
		spellService.save(spell)
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	Spell saveSpell(@RequestBody Spell spell) {
		spellService.save(spell)
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	def deleteSpell(@PathVariable Integer id) {
		spellService.delete(id)
	}
}
