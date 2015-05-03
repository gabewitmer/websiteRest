package com.cagnosolutions.webrest.groupSpells.powerPoints

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service
class PowerPointsService {
	
	@Autowired
	PowerPointsRepository repo

	PowerPoints findOneByUser(Integer userId) {
		repo.findOneByUser(userId)
	}

	PowerPoints findOne(Integer id) {
		repo.findOne(id)
	}

	PowerPoints save(PowerPoints powerPoints) {
		repo.save(powerPoints)
	}
	
	def delete(Integer id) {
		repo.delete(id)
	}
}
