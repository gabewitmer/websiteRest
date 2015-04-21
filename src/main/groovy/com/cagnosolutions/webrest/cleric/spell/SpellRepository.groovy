package com.cagnosolutions.webrest.cleric.spell

import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository

@CompileStatic
interface SpellRepository extends JpaRepository<Spell, Integer> {
}