package com.sparta.jpaquiz.application.service.user;

import com.sparta.jpaquiz.application.dtos.user.UserDto;
import com.sparta.jpaquiz.application.dtos.user.UserResponseDto;
import com.sparta.jpaquiz.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserQueryService userQueryService;
    private final UserCommandService userCommandService;

    public UserService(UserQueryService userQueryService, UserCommandService userCommandService) {
        this.userQueryService = userQueryService;
        this.userCommandService = userCommandService;
    }

    /**
     * 1. userId 를 {@link UserQueryService#getUser(Long)} 에 전달하여<br/>
     * 유저 정보를 조회하는 외부 API를 호출하세요.<br/>
     * 2. {@link UserQueryService#getUser(Long)} 의 {@link UserResponseDto} 응답 객체를 받아 {@link User} 엔티티로 변환 후 DB에 저장하세요.
     * @param userId
     */
    public UserDto createUser(Long userId) {
        UserResponseDto response = userQueryService.getUser(userId);
        User user = userCommandService.addUser(response);
        return UserDto.from(user);
    }
}
