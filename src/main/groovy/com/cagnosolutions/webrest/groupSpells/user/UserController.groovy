package com.cagnosolutions.webrest.groupSpells.user
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@CompileStatic
@RestController
@RequestMapping("/user")
class UserController {
	
	@Autowired
	UserService userService
	
	@RequestMapping(method = RequestMethod.GET)
	List<User> findAllUsers() {
		userService.findAll()
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	User login(@RequestParam String username, @RequestParam String password) {
		userService.findByUsernameAndPassword(username, password)
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	User findOneUser(@PathVariable Integer id) {
		userService.findOne(id)
	}
	
	@RequestMapping(method = RequestMethod.POST)
	User addUser(@RequestBody User user) {
		userService.save(user)
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	def deleteUser(@PathVariable Integer id) {
		userService.delete(id)
	}
}
