package com.idorasi.cbdemo.controller;

import com.idorasi.cbdemo.model.User;
import com.idorasi.cbdemo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable UUID id) {
        return userService.findById(id);
    }

    @PostMapping("/{email}/{name}")
    public User post(@PathVariable String email, @PathVariable String name) {
        return userService.addUser(name, email);
    }
}
