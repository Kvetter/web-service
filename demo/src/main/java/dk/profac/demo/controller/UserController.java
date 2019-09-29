package dk.profac.demo.controller;

import dk.profac.demo.model.User;
import dk.profac.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;


@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @GetMapping("/login")
    public ResponseEntity login(@RequestParam String username, @RequestParam String password) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            return new ResponseEntity("User not found", HttpStatus.FORBIDDEN);
        } else {
            return new ResponseEntity(user, HttpStatus.OK);
        }
    }

    @Transactional
    @PostMapping("/user")
    public ResponseEntity createUser(@RequestParam String username, @RequestParam String password) {
        User u = new User(username, password);
        User user = userRepository.save(u);
        return  new ResponseEntity(user, HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/user")
    public ResponseEntity deleteUser(@RequestParam String username) {
        int delete = userRepository.deleteByUsername(username);
        return new ResponseEntity(delete, HttpStatus.OK);
    }


}
