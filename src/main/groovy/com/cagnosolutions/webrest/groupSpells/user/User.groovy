package com.cagnosolutions.webrest.groupSpells.user

import groovy.transform.CompileStatic

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@CompileStatic
@Entity
class User {

	@Id
	@GeneratedValue
	Integer id
	String name
	String username
	String password
	String role = "ROLE_USER"
	Short active = 1
	Boolean powerPoints
	@Column(columnDefinition = "longblob")
	HashMap<String, Integer> spellsPerDay

}
