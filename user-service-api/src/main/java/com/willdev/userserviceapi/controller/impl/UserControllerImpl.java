package com.willdev.userserviceapi.controller.impl;

import com.willdev.userserviceapi.controller.UserController;
import com.willdev.userserviceapi.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import models.requests.CreateUserRequest;
import models.responses.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {
    private final UserService userService;

    @Override
    public ResponseEntity<UserResponse> findById(final String id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @Override
    public ResponseEntity<Void> save(@Valid final CreateUserRequest request) {
        userService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED.value()).build();
    }
}

