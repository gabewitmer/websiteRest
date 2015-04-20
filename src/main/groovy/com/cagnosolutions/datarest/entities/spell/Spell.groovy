package com.cagnosolutions.datarest.entities.spell

import groovy.transform.CompileStatic

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
	String name, school, spellType, components, level, castingTime, spellRange, spellTarget, spellDuration, description, savingThrow, spellResistance, aoe
}
