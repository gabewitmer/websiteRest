package com.cagnosolutions.webrest.groupSpells.powerPoints

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@CompileStatic
@RestController
@RequestMapping("/user/{userId}/powerPoints")
class PowerPointsController {
	
	@Autowired
	PowerPointsService powerPointsService
	
	@RequestMapping(method = RequestMethod.GET)
	PowerPoints findOnePowerPointsByUser(@PathVariable Integer userId) {
		powerPointsService.findOneByUser(userId)
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	PowerPoints findOnePowerPoints(@PathVariable Integer id) {
		powerPointsService.findOne(id)
	}

	@RequestMapping(method = RequestMethod.POST)
	PowerPoints addPowerPoints(@RequestBody PowerPoints powerPoints) {
		powerPointsService.save(powerPoints)
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	def deletePowerPoints(@PathVariable Integer id) {
		powerPointsService.delete(id)
	}
}
