package com.willdev.hdcommonslib.models.requests;

import com.willdev.hdcommonslib.models.enums.ProfileEnum;

import java.util.Set;

public record CreateUserRequest(String name, String email, String password, Set<ProfileEnum> profiles) {

    public CreateUserRequest withName(String name) {
        return new CreateUserRequest(name, this.email, this.password, this.profiles);
    }

    public CreateUserRequest withEmail(String email) {
        return new CreateUserRequest(this.name, email, this.password, this.profiles);
    }

    public CreateUserRequest withPassword(String password) {
        return new CreateUserRequest(this.name, this.email, password, this.profiles);
    }

    public CreateUserRequest withProfiles(Set<ProfileEnum> profiles) {
        return new CreateUserRequest(this.name, this.email, this.password, profiles);
    }
}
