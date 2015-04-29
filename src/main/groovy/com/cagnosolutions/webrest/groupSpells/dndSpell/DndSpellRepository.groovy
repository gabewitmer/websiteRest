package com.cagnosolutions.webrest.groupSpells.dndSpell
import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@CompileStatic
interface DndSpellRepository extends JpaRepository<DndSpell, Integer> {

	@Query("SELECT s FROM DndSpell s WHERE s.name LIKE :search ORDER BY s.name")
	List<DndSpell> findAllAlpha(@Param("search") String search)
}