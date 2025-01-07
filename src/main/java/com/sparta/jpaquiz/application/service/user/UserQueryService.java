package com.sparta.jpaquiz.application.service.user;

import com.sparta.jpaquiz.application.dtos.user.UserResponseDto;

public interface UserQueryService {
    UserResponseDto getUser(Long userId);
}
