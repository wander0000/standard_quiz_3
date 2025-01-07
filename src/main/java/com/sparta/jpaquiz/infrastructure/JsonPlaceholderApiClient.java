package com.sparta.jpaquiz.infrastructure;

import com.sparta.jpaquiz.application.dtos.post.PostRequestDto;
import com.sparta.jpaquiz.application.dtos.post.PostResponseDto;
import com.sparta.jpaquiz.application.dtos.user.UserResponseDto;
import com.sparta.jpaquiz.application.service.post.PostService;
import com.sparta.jpaquiz.application.service.user.UserQueryService;
import org.springframework.stereotype.Service;

@Service
public class JsonPlaceholderApiClient implements UserQueryService, PostService {
    // 외부 API URL
    private final static String API_URL = "https://jsonplaceholder.typicode.com/";

    /**
     * 1. userId 를 Path Parameter 로 전달 할 수 있도록 API 요청 URL 을 만드세요.<br/>
     * 2. RestTemplate 를 이용해서 외부 API 를 호출한 뒤 {@link UserResponseDto} 객체로 응답하세요.
     * @see <a href="https://jsonplaceholder.typicode.com/users/1">유저 단건 조회 외부 API 주소</a>
     * @param userId 유저 ID
     * @return {@link UserResponseDto} 유저 응답 객체
     */
    @Override
    public UserResponseDto getUser(Long userId) {
    }

    /**
     * 1. {@link PostRequestDto} 객체를 이용하여 게시글을 저장하는 외부 API를 연동하세요.<br/><br/>
     * 2. {@link PostResponseDto} 형태로 응답하세요.
     * @param request 게시글 생성 요청 객체 ({@link PostRequestDto})
     * @return {@link PostResponseDto}
     *
     * @see <a href="https://jsonplaceholder.typicode.com/guide">외부 API 연동 가이드</a>
     * @see <a href="https://jsonplaceholder.typicode.com/posts">게시글 저장 외부 API</a>
     *
     */
    @Override
    public PostResponseDto addPost(PostRequestDto request) {
    }
}
