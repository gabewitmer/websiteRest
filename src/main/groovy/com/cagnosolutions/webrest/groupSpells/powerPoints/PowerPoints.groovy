package com.cagnosolutions.webrest.groupSpells.powerPoints

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class PowerPoints {

	@Id
	@GeneratedValue
	Integer id

	Integer userId
	Integer totalPoints = 0
	Integer remainingPoints = 0
}
