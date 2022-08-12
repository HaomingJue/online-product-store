package com.sha.springbootproductstore.controller;

import com.sha.springbootproductstore.model.Role;
import com.sha.springbootproductstore.service.UserService;
import com.sha.springbootproductstore.seucrity.UserPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user") //prefix path
public class UserController {
    @Autowired
    private UserService userService;

    @PutMapping("change/{role}") // api/user/change/{role}
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserPrinciple userPrinciple, @PathVariable Role role) {

        userService.changeRole(role, userPrinciple.getUsername());

        return ResponseEntity.ok(true);
    }
}
