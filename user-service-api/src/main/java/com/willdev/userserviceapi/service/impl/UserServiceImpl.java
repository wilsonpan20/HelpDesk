package com.willdev.userserviceapi.service.impl;

import com.willdev.userserviceapi.mapper.UserMapper;
import com.willdev.userserviceapi.repository.UserRepository;
import com.willdev.userserviceapi.service.UserService;
import lombok.RequiredArgsConstructor;
import models.exceptions.ResourceNotFoundException;
import models.requests.CreateUserRequest;
import models.responses.UserResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserMapper userMapper;


    @Override
    public UserResponse findById(final String id) {
        return userMapper.fromEntity(repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Object not found. Id: " + id + ", Type: " + UserResponse.class.getSimpleName())));
    }

    @Override
    public void save(final CreateUserRequest request) {
        repository.save(userMapper.fromRequest(request));
    }

}
