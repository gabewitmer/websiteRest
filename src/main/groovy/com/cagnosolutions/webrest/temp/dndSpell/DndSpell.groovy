package com.cagnosolutions.webrest.temp.dndSpell
import com.cagnosolutions.webrest.temp.dndRulebook.DndRulebook
import com.cagnosolutions.webrest.temp.dndSpellschool.DndSpellschool
import com.cagnosolutions.webrest.temp.dndSpellsubschool.DndSpellsubschool

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class DndSpell {

	@Id
	@GeneratedValue
	Integer id

	@ManyToOne
	@JoinColumn(name="school_id")
	DndSpellschool dndSpellschool

	@ManyToOne
	@JoinColumn(name="sub_school_id")
	DndSpellsubschool dndSpellsubschool

	@ManyToOne
	@JoinColumn(name="rulebook_id")
	DndRulebook dndRulebook
	Integer Page

	String name, castingTime, spellRange, target, effect, area, duration, savingThrow, spellResistance, descriptionHtml
	Boolean verbalComponent, somaticComponent, materialComponent, arcaneFocusComponent, divineFocusComponent, xpComponent, metaBreathComponent, trueNameComponent, corruptComponent
}
