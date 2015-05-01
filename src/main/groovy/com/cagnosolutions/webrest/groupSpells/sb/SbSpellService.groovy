package com.cagnosolutions.webrest.groupSpells.sb

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service
class SbSpellService {

	@Autowired
	SbSpellRepository repo

	List<SbDndSpell> findAllAlpha(String search) {
		repo.findAllAlpha(search)
	}

	SbDndSpell findOne(Integer id) {
		repo.findOne(id)
	}

	SbDndSpell save(SbDndSpell dndSpell) {
		repo.save(dndSpell)
	}

	def delete(Integer id) {
		repo.delete(id)
	}
}
