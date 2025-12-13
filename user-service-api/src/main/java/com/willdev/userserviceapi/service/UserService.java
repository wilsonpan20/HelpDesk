package com.willdev.userserviceapi.service;

import com.willdev.hdcommonslib.models.requests.CreateUserRequest;
import com.willdev.hdcommonslib.models.responses.UserResponse;

public interface UserService {
    public UserResponse findById(final String id);
    public void save(final CreateUserRequest request);
}
