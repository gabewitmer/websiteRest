package com.cagnosolutions.webrest.groupSpells.dndSpell

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@CompileStatic
@RestController
@RequestMapping("/dndspell")
class DndSpellController {
	
	@Autowired
	DndSpellService dndSpellService
	
	@RequestMapping(method = RequestMethod.GET)
	List<DndSpell> findAll(@RequestParam(required = false) String search) {
		dndSpellService.findAllAlpha((search == null) ? "A%" : search + "%")
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	DndSpell findOneDndSpell(@PathVariable Integer id) {
		dndSpellService.findOne(id)
	}

	@RequestMapping(method = RequestMethod.POST)
	DndSpell addDndSpell(@RequestBody DndSpell dndSpell) {
		dndSpellService.save(dndSpell)
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	def deleteDndSpell(@PathVariable Integer id) {
		dndSpellService.delete(id)
	}
}
