package com.cagnosolutions.webrest.groupSpells.traditional

import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@CompileStatic
interface TraditionalRepository extends JpaRepository<Traditional, Integer> {

	@Query("SELECT t FROM Traditional t WHERE t.userId=:userId")
	Traditional findOneByUser(@Param("userId") Integer userId)
}