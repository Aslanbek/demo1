package com.example.demo1.controller;

import com.example.demo1.entity.WaxauthUser;
import com.example.demo1.exception.UserAlreadyExistException;
import com.example.demo1.exception.UserNotFoundException;
import com.example.demo1.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * this is comment for class
 */
@RestController
@RequestMapping("/users")
public class UserController {
    /**
     * injection
     */
    @Autowired
    private UserServiceImpl userService;

    /**
     * this is comment for constructor of class
     */
    public UserController() {
    }

    /**
     * desc
     *
     * @param waxauthUser user
     * @return entity
     */
    @PostMapping
    public ResponseEntity registration(@RequestBody WaxauthUser waxauthUser) {
        try {
            userService.registration(waxauthUser);
            return ResponseEntity.ok("user registration success");
        } catch (UserAlreadyExistException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("ERROR-user-registration");
        }
    }

    /**
     * descr
     *
     * @param id user id
     * @return ResponseEntity
     */
    @GetMapping()
    public ResponseEntity getUser(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(userService.getById(id));
        } catch (UserNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("error on getUser");
        }
    }

    @PatchMapping
    public ResponseEntity getAllUsers() {
        return ResponseEntity.ok(userService.getAll());
    }
}
