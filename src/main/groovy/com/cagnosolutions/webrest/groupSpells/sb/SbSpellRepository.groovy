package com.cagnosolutions.webrest.groupSpells.sb

import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@CompileStatic
interface SbSpellRepository extends JpaRepository<SbDndSpell, Integer> {

	@Query("SELECT s FROM SbDndSpell s WHERE s.name LIKE :search ORDER BY s.name")
	List<SbDndSpell> findAllAlpha(@Param("search") String search)
}