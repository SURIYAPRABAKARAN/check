package firstPackage;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


public class UserController {
	@Autowired
	private UserService service;

	// GET /users
	// retrieveAllUserBeans
	@GetMapping("/users")
	public List<UserBean> retrieveAllUserBeans() {
		return service.findAll();
	}

	// GET /users/{id}
	@GetMapping("/users/{id}")
	public UserBean retrieveUserBean(@PathVariable String name) throws UserBeanNotFoundException {

		UserBean user = service.findOne(name);
		if (user == null)
			throw new UserBeanNotFoundException("id-" + name);

		return user;
	}

	@GetMapping("/users/hateoas/{id}")
	public EntityModel<UserBean> retrieveUserBean_hateoas(@PathVariable String name) throws UserBeanNotFoundException {
		UserBean user = service.findOne(name);

		if (user == null)
			throw new UserBeanNotFoundException("id-" + name);

		// "all-users", SERVER_PATH + "/users"
		// retrieveAllUserBeans
		EntityModel<UserBean> resource = EntityModel.of(user);

		WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllUserBeans());

		resource.add(linkTo.withRel("all-users"));

		// HATEOAS

		return resource;
	}

	// input - details of user
	// output - Created & Return the Created URI

	@PostMapping("/users")
	public UserBean createUserBean(@RequestBody UserBean user) {

	return service.save(user);


	}

	@DeleteMapping("/users/{id}")
	public UserBean deleteUserBean(@PathVariable String name) throws UserBeanNotFoundException {
		return service.deleteById(name);

	
}
}