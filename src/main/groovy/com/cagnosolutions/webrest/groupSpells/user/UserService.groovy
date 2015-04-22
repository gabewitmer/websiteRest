package com.cagnosolutions.webrest.groupSpells.user

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service
class UserService {
	
	@Autowired
	UserRepository repo
	
	List<User> findAll() {
		repo.findAll()
	}
	
	User findOne(Integer id) {
		repo.findOne(id)
	}
	
	User save(User user) {
		repo.save(user)
	}
	
	def delete(Integer id) {
		repo.delete(id)
	}

	User findByUsernameAndPassword(String username, String password) {
		repo.findByUsernameAndPassword(username, password)
	}
}
