package com.willdev.userserviceapi.service;

import com.willdev.userserviceapi.entity.User;

public interface UserService {
    public User findById(String id);
}
