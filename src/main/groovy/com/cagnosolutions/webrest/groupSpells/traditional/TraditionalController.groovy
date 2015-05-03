package com.cagnosolutions.webrest.groupSpells.traditional

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@CompileStatic
@RestController
@RequestMapping("/user/{userId}/traditional")
class TraditionalController {
	
	@Autowired
	TraditionalService traditionalService
	
	@RequestMapping(method = RequestMethod.GET)
	Traditional findOneTraditionalByUser(@PathVariable Integer userId) {
		traditionalService.findOneByUser(userId)
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	Traditional findOneTraditional(@PathVariable Integer id) {
		traditionalService.findOne(id)
	}

	@RequestMapping(method = RequestMethod.POST)
	Traditional addTraditional(@RequestBody Traditional traditional) {
		traditionalService.save(traditional)
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	def deleteTraditional(@PathVariable Integer id) {
		traditionalService.delete(id)
	}
}
