package com.willdev.userserviceapi.service.impl;

import com.willdev.hdcommonslib.models.responses.models.exceptions.ResourceNotFoundException;
import com.willdev.hdcommonslib.models.responses.models.requests.CreateUserRequest;
import com.willdev.hdcommonslib.models.responses.models.responses.UserResponse;
import com.willdev.userserviceapi.mapper.UserMapper;
import com.willdev.userserviceapi.repository.UserRepository;
import com.willdev.userserviceapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
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
        verifyEmailAlreadyExistts(request.email(), null);
        repository.save(userMapper.fromRequest(request));
    }

    private void verifyEmailAlreadyExistts(final String email, final String id) {
        repository.findByEmail(email).filter(user -> !user.getId().equals(id)).ifPresent(user -> {
            throw new DataIntegrityViolationException("Email [" + email + "] already exists: ");
        });

    }

}
