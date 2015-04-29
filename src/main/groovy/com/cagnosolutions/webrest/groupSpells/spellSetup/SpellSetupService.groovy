package com.cagnosolutions.webrest.groupSpells.spellSetup

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service
class SpellSetupService {
	
	@Autowired
	SpellSetupRepository repo

	SpellSetup findAllByUser(Integer userId) {
		repo.findAllByUser(userId)
	}

	SpellSetup findOne(Integer id) {
		repo.findOne(id)
	}

	SpellSetup save(SpellSetup spellSetup) {
		repo.save(spellSetup)
	}
	
	def delete(Integer id) {
		repo.delete(id)
	}
}
