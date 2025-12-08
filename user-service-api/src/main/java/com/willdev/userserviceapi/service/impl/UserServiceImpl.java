package com.willdev.userserviceapi.service.impl;

import com.willdev.userserviceapi.entity.User;
import com.willdev.userserviceapi.repository.UserRepository;
import com.willdev.userserviceapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public User findById(String id) {
        return repository.findById(id).orElse(null);
    }

}
