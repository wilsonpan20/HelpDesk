package com.willdev.userserviceapi.mapper;

import com.willdev.hdcommonslib.models.responses.UserResponse;
import com.willdev.userserviceapi.entity.User;
import org.mapstruct.Mapper;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = IGNORE, nullValueCheckStrategy = ALWAYS

)
public interface UserMapper {

    UserResponse fromEntity(final User user);
}
