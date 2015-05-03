package com.cagnosolutions.webrest.groupSpells.spellSetup
import com.cagnosolutions.webrest.temp.dndSpell.DndSpell

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
	List<DndSpell> picked0
	@ManyToMany
	List<DndSpell> picked1
	@ManyToMany
	List<DndSpell> picked2
	@ManyToMany
	List<DndSpell> picked3
	@ManyToMany
	List<DndSpell> picked4
	@ManyToMany
	List<DndSpell> picked5
	@ManyToMany
	List<DndSpell> picked6
	@ManyToMany
	List<DndSpell> picked7
	@ManyToMany
	List<DndSpell> picked8
	@ManyToMany
	List<DndSpell> picked9

}
