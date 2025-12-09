package com.willdev.userserviceapi.service;

import com.willdev.hdcommonslib.models.responses.UserResponse;
import com.willdev.userserviceapi.entity.User;

public interface UserService {
    public UserResponse findById(String id);
}
