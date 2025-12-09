package com.willdev.userserviceapi.service.impl;

import com.willdev.hdcommonslib.models.responses.UserResponse;
import com.willdev.userserviceapi.entity.User;
import com.willdev.userserviceapi.mapper.UserMapper;
import com.willdev.userserviceapi.repository.UserRepository;
import com.willdev.userserviceapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserMapper userMapper;


    @Override
    public UserResponse findById(String id) {
        return userMapper.fromEntity(repository.findById(id).orElse(null));
    }

}
