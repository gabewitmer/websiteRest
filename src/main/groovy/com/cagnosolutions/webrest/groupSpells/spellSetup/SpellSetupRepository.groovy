package com.cagnosolutions.webrest.groupSpells.spellSetup

import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@CompileStatic
interface SpellSetupRepository extends JpaRepository<SpellSetup, Integer> {

	@Query("SELECT s FROM SpellSetup s WHERE s.userId=:userId")
	SpellSetup findAllByUser(@Param("userId") Integer userId)
}