package com.cagnosolutions.webrest.groupSpells.spellBuddy

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@CompileStatic
@Service
class SpellBuddyService {
	
	@Autowired
	SpellBuddyRepository repo

	List<SpellBuddy> findAllByUser(Integer userId) {
		repo.findAllByUser(userId)
	}

	Map<String, List<SpellBuddy>> findAllOrganizedByUser(Integer userId) {
		def spellMap = new TreeMap<String, List<SpellBuddy>>()
		def allSpells = repo.findAllByUser(userId);
		allSpells.each { SpellBuddy spellBuddy ->
			spellMap.containsKey(spellBuddy.level) ? spellMap.get(spellBuddy.level).add(spellBuddy) : spellMap.put(spellBuddy.level, new ArrayList<SpellBuddy>(){{
				add(spellBuddy)
			}})

		}
		spellMap
	}

	SpellBuddy findOne(Integer id) {
		repo.findOne(id)
	}

	SpellBuddy save(SpellBuddy spellBuddy) {
		repo.save(spellBuddy)
	}
	
	def delete(Integer id) {
		repo.delete(id)
	}
}
