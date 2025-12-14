package com.willdev.userserviceapi.service;


import models.requests.CreateUserRequest;
import models.responses.UserResponse;

public interface UserService {
    public UserResponse findById(final String id);
    public void save(final CreateUserRequest request);
}
