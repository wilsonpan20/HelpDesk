package com.willdev.userserviceapi.controller.impl;

import com.willdev.userserviceapi.controller.UserController;
import com.willdev.userserviceapi.entity.User;
import com.willdev.userserviceapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {
    private final UserService userService;

    @Override
    public ResponseEntity<User> findById(String id) {
        User user = userService.findById(id);
        return ResponseEntity.ok(user);
    }
}
