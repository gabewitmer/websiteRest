package com.cagnosolutions.webrest.groupSpells.powerPoints

import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@CompileStatic
interface PowerPointsRepository extends JpaRepository<PowerPoints, Integer> {

	@Query("SELECT p FROM PowerPoints p WHERE p.userId=:userId")
	PowerPoints findOneByUser(@Param("userId") Integer userId)
}