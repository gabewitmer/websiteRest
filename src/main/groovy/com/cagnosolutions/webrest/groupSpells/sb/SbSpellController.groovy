package com.cagnosolutions.webrest.groupSpells.sb

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
class SbSpellController {

	@Autowired
	SbSpellService sbSpellService

	@RequestMapping(method = RequestMethod.GET)
	List<SbDndSpell> findAll(@RequestParam(required = false) String search) {
		sbSpellService.findAllAlpha((search == null) ? "A%" : search + "%")
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	SbDndSpell findOneDndSpell(@PathVariable Integer id) {
		sbSpellService.findOne(id)
	}

	@RequestMapping(method = RequestMethod.POST)
	SbDndSpell addDndSpell(@RequestBody SbDndSpell dndSpell) {
		sbSpellService.save(dndSpell)
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	def deleteDndSpell(@PathVariable Integer id) {
		sbSpellService.delete(id)
	}
}
