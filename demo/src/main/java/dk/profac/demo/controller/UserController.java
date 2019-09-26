package dk.profac.demo.controller;

import dk.profac.demo.model.ProfacUser;
import dk.profac.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @GetMapping("/login")
    public ProfacUser login(@RequestParam String username, @RequestParam String password) {
        ProfacUser profacUser = userRepository.getByUsername(username);

        /*
        If we have a user (user!=null) we know the username exists in our database, we then need to validate the password
        with our user object
         */
        return profacUser;
    }

    @PostMapping("/user")
    public ProfacUser createUser(@RequestParam String username, @RequestParam String password) {
        return userRepository.createUser(username, password);
    }


}
