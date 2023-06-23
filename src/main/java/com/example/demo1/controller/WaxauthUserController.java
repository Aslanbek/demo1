package com.example.demo1.controller;

import com.example.demo1.entity.WaxauthUser;
import com.example.demo1.exception.UserAlreadyExistException;
import com.example.demo1.exception.UserNotFoundException;
import com.example.demo1.repository.WaxauthUserRepository;
import com.example.demo1.service.impl.WaxauthUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * this is comment for class
 */
@RestController
@RequestMapping("/users")
public class WaxauthUserController {
    /**
     * injection
     */
    @Autowired
    private WaxauthUserServiceImpl waxauthUserService;

    /**
     * this is comment for constructor of class
     */
    public WaxauthUserController() {
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
            waxauthUserService.registration(waxauthUser);
            return ResponseEntity.ok("user registration success");
        } catch (UserAlreadyExistException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("ERROR-user-registration");
        }
    }

    /**
     * descr
     * @param id user id
     * @return ResponseEntity
     */
    @GetMapping()
    public ResponseEntity getUser(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(waxauthUserService.getById(id));
        } catch (UserNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e){
            return ResponseEntity.badRequest().body("error on getUser");
        }
    }
}
