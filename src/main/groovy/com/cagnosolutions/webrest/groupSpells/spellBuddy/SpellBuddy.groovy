package com.cagnosolutions.webrest.groupSpells.spellBuddy

import groovy.transform.CompileStatic

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by gabe on 4/13/15.
 */
@CompileStatic
@Entity
class SpellBuddy {
	@Id
	@GeneratedValue
	Integer id

	Integer userId
	@Column(length = 10000)
	String description
	Integer level
	String name, school, spellType, components, effect, castingTime, spellRange, spellTarget, spellDuration, savingThrow, spellResistance, area

}
