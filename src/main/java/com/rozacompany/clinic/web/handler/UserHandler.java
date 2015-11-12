/**
 * 
 */
package com.rozacompany.clinic.web.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rozacompany.clinic.service.UserService;

/**
 * @author Siva
 *
 */
@Controller
@RequestMapping("/user")
public class UserHandler {

	@Autowired
	private UserService userService;

	// @RequestMapping(value="", method=RequestMethod.GET,
	// produces=MediaType.APPLICATION_JSON_VALUE)
	// @ResponseBody
	// public List<User> findAll()
	// {
	// return userService.findAll();
	// }
	//
	// @RequestMapping(value="{id}", method=RequestMethod.GET,
	// produces=MediaType.APPLICATION_JSON_VALUE)
	// @ResponseBody
	// public User findUser(@PathVariable("id") int id) {
	// return userService.findUserById(id);
	// }
	//
	// @RequestMapping(value="", method=RequestMethod.POST,
	// produces=MediaType.APPLICATION_JSON_VALUE)
	// @ResponseBody
	// public ResponseEntity<User> createUser(@RequestBody User user) {
	// User savedUser = userService.create(user);
	// return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
	// }
	//
	// @RequestMapping(value="", method=RequestMethod.PUT,
	// produces=MediaType.APPLICATION_JSON_VALUE)
	// @ResponseBody
	// public ResponseEntity<User> updateUser(@RequestBody User user) {
	// User savedUser = userService.update(user);
	// return new ResponseEntity<User>(savedUser, HttpStatus.OK);
	// }
	//
	// @RequestMapping(value="{id}", method=RequestMethod.DELETE,
	// produces=MediaType.APPLICATION_JSON_VALUE)
	// @ResponseBody
	// public ResponseEntity<Void> deleteUser(@PathVariable("id") int id) {
	// userService.deleteUser(id);
	// return new ResponseEntity<>(HttpStatus.OK);
	// }

}
