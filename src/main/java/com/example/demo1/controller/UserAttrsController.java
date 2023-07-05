package com.example.demo1.controller;

import com.example.demo1.entity.WaxauthUserattrs;
import com.example.demo1.service.impl.UserAttrsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userattrs")
public class UserAttrsController {

    @Autowired
    private UserAttrsServiceImpl attrsService;

    @GetMapping
    public ResponseEntity getAttrs() {
        return ResponseEntity.ok(attrsService.getAll());
    }

    @PostMapping
    public ResponseEntity createAttr(@RequestBody WaxauthUserattrs waxauthUserattrs, @RequestParam Long userId) {
        try {
            return ResponseEntity.ok(attrsService.createAttr(waxauthUserattrs, userId));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("error on createAttr");
        }
    }

    @PutMapping
    public ResponseEntity updateAttr(@RequestBody WaxauthUserattrs waxauthUserattrs) {
        try {
            return ResponseEntity.ok(attrsService.update(waxauthUserattrs));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("error on updateAttr");
        }
    }
}
