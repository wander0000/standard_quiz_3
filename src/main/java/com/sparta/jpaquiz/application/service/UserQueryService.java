package com.sparta.jpaquiz.application.service;

import com.sparta.jpaquiz.application.dtos.UserDto;

public interface UserQueryService {
    UserDto getUser(Long userId);
}
