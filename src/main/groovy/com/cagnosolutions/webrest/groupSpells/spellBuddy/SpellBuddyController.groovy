package com.cagnosolutions.webrest.groupSpells.spellBuddy
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@CompileStatic
@RestController
@RequestMapping("/user/{userId}/spell")
class SpellBuddyController {
	
	@Autowired
	SpellBuddyService spellBuddyService
	
	@RequestMapping(method = RequestMethod.GET)
	List<SpellBuddy> findAllSpellBuddiesByUser(@PathVariable Integer userId) {
		spellBuddyService.findAllByUser(userId)
	}

	@RequestMapping(value = "/order", method = RequestMethod.GET)
	Map findAllSpellBuddiesOrganized(@PathVariable Integer userId) {
		spellBuddyService.findAllOrganizedByUser(userId)
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	SpellBuddy findOneSpellBuddy(@PathVariable Integer userId, @PathVariable Integer id) {
		spellBuddyService.findOne(id)
	}

	@RequestMapping(method = RequestMethod.POST)
	SpellBuddy addSpellBuddy(@RequestBody SpellBuddy spellBuddy) {
		spellBuddyService.save(spellBuddy)
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	def deleteSpellBuddy(@PathVariable Integer id) {
		spellBuddyService.delete(id)
	}
}
