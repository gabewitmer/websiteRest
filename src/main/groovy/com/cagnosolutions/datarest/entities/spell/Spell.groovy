package com.cagnosolutions.datarest.entities.spell

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
class Spell {
	@Id
	@GeneratedValue
	Integer id

	Integer level
	@Column(length = 10000)
	String description
	String name, school, spellType, components, castingTime, spellRange, spellTarget, spellDuration, savingThrow, spellResistance, aoe

}
