package com.cagnosolutions.webrest.groupSpells.dndSpell

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class DndSpell {

	@Id
	@GeneratedValue
	Integer id

	String name, castingTime, spellRange, target, effect, area, duration, savingThrow, spellResistance, descriptionHtml
	Boolean verbalComponent, somaticComponent, materialComponent, arcaneFocusComponent, divineFocusComponent, xpComponent, metaBreathComponent, trueNameComponent, corruptComponent
}
