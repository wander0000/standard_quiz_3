package com.sparta.jpaquiz.application.service;

import com.sparta.jpaquiz.application.dtos.PostRequestDto;
import com.sparta.jpaquiz.application.dtos.PostResponseDto;
import com.sparta.jpaquiz.application.dtos.UserDto;
import com.sparta.jpaquiz.domain.entity.User;
import com.sparta.jpaquiz.infrastructure.JsonPlaceholderApiClient;
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
     * 1. userId 를 {@link JsonPlaceholderApiClient#getUser(Long)} 에 전달하여<br/>
     * 유저 정보를 조회하는 외부 API를 연동하세요.<br/><br/>
     * 2. {@link JsonPlaceholderApiClient#getUser(Long)} 의 {@link UserDto} 응답 객체를 받아 {@link User} 엔티티로 변환 후 DB에 저장하세요.
     * @param userId
     */
    public void createUser(Long userId) {

    }

    /**
     * 1. {@link PostRequestDto} 객체를 {@link JsonPlaceholderApiClient#addPost(PostRequestDto)} 에 전달하여<br/>
     * 게시글을 저장하는 외부 API를 연동하세요.<br/><br/>
     * 2. {@link PostResponseDto} 를 응답하세요.
     * @param request
     */
    public PostResponseDto addPost(PostRequestDto request) {

    }
}
