package com.cagnosolutions.datarest.entities.spell

import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository

@CompileStatic
interface SpellRepository extends JpaRepository<Spell, Integer> {
}