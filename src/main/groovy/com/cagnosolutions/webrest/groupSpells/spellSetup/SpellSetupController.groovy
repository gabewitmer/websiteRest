package com.cagnosolutions.webrest.groupSpells.spellSetup

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@CompileStatic
@RestController
@RequestMapping("/user/{userId}/spellsetup")
class SpellSetupController {
	
	@Autowired
	SpellSetupService spellSetupService
	
	@RequestMapping(method = RequestMethod.GET)
	SpellSetup findAllSpellSetupByUser(@PathVariable Integer userId) {
		spellSetupService.findAllByUser(userId)
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	SpellSetup findOneSpellSetup(@PathVariable Integer id) {
		spellSetupService.findOne(id)
	}

	@RequestMapping(method = RequestMethod.POST)
	SpellSetup addSpellSetup(@RequestBody SpellSetup spellSetup) {
		spellSetupService.save(spellSetup)
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	def deleteSpellSetup(@PathVariable Integer id) {
		spellSetupService.delete(id)
	}
}
