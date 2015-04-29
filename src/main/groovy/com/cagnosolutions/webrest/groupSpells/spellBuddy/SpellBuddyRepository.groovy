package com.cagnosolutions.webrest.groupSpells.spellBuddy

import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@CompileStatic
interface SpellBuddyRepository extends JpaRepository<SpellBuddy, Integer> {

	@Query("SELECT s FROM SpellBuddy s WHERE s.userId=:userId")
	List<SpellBuddy> findAllByUser(@Param("userId") Integer userId)
}