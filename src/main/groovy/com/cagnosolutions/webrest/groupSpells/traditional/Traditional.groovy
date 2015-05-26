package com.cagnosolutions.webrest.groupSpells.traditional

import groovy.transform.CompileStatic

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@CompileStatic
@Entity
class Traditional {

	@Id
	@GeneratedValue
	Integer id

	Integer userId
	ArrayList<Integer> knownSpells = new ArrayList<Integer>()
	ArrayList<Integer> remainingSpells = new ArrayList<Integer>()
	//ArrayList<ArrayList<Integer>> preparedSpells = new ArrayList<>()
	ArrayList<Integer> prepared0 = new ArrayList<>()
	ArrayList<Integer> prepared1 = new ArrayList<>()
	ArrayList<Integer> prepared2 = new ArrayList<>()
	ArrayList<Integer> prepared3 = new ArrayList<>()
	ArrayList<Integer> prepared4 = new ArrayList<>()
	ArrayList<Integer> prepared5 = new ArrayList<>()
	ArrayList<Integer> prepared6 = new ArrayList<>()
	ArrayList<Integer> prepared7 = new ArrayList<>()
	ArrayList<Integer> prepared8 = new ArrayList<>()
	ArrayList<Integer> prepared9 = new ArrayList<>()
}
