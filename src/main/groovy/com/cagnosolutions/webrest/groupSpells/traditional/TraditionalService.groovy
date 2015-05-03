package com.cagnosolutions.webrest.groupSpells.traditional

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service
class TraditionalService {
	
	@Autowired
	TraditionalRepository repo

	Traditional findOneByUser(Integer userId) {
		repo.findOneByUser(userId)
	}

	Traditional findOne(Integer id) {
		repo.findOne(id)
	}

	Traditional save(Traditional traditional) {
		repo.save(traditional)
	}
	
	def delete(Integer id) {
		repo.delete(id)
	}
}
