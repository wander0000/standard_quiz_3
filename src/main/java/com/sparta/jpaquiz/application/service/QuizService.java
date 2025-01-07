package com.sparta.jpaquiz.application.service;

import com.sparta.jpaquiz.application.dtos.post.PostRequestDto;
import com.sparta.jpaquiz.application.dtos.post.PostResponseDto;
import com.sparta.jpaquiz.application.dtos.user.UserDto;
import com.sparta.jpaquiz.application.service.post.PostService;
import com.sparta.jpaquiz.application.service.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class QuizService {
    private final UserService userService;
    private final PostService postService;

    public QuizService(UserService userService, PostService postService) {
        this.userService = userService;
        this.postService = postService;
    }

    /**
     * TODO: 1. 유저 id 로 외부 API를 호출하여 유저 정보를 받아오고 받아온 정보를 활용하여 User Entity 에 저장하세요.
     * @param userId 유저 ID
     * @return {@link UserDto} 유저 정보 응답 객체
     */
    public UserDto createUser(Long userId) {
    }

    /**
     * TODO: 2. 요청 객체를 게시글 등록 외부 API 로 전달하여 데이터를 저장하세요
     * @param request 게시글 작성 요청 객체
     * @return {@link PostResponseDto} 게시글 작성 응답 객체
     */
    public PostResponseDto addPost(PostRequestDto request) {
    }
}
