package com.cagnosolutions.webrest.groupSpells.user
import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@CompileStatic
interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT u FROM User u WHERE u.username=:username AND u.password=:password AND active=1")
	User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password)
}