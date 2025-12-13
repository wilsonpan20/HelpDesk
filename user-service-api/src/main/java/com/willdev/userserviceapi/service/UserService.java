package com.willdev.userserviceapi.service;

import com.willdev.hdcommonslib.models.responses.UserResponse;

public interface UserService {
    public UserResponse findById(String id);
}
