package com.cagnosolutions.webrest.groupSpells.spellSetup

import com.cagnosolutions.webrest.groupSpells.sb.SbDndSpell

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToMany
/**
 * Created by greg on 4/27/15.
 */

@Entity
class SpellSetup {

	@Id
	@GeneratedValue
	Integer id

	Integer userId

	@ManyToMany
	List<SbDndSpell> picked0
	@ManyToMany
	List<SbDndSpell> picked1
	@ManyToMany
	List<SbDndSpell> picked2
	@ManyToMany
	List<SbDndSpell> picked3
	@ManyToMany
	List<SbDndSpell> picked4
	@ManyToMany
	List<SbDndSpell> picked5
	@ManyToMany
	List<SbDndSpell> picked6
	@ManyToMany
	List<SbDndSpell> picked7
	@ManyToMany
	List<SbDndSpell> picked8
	@ManyToMany
	List<SbDndSpell> picked9

}
