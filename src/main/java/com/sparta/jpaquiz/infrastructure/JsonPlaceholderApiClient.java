package com.sparta.jpaquiz.infrastructure;

import com.sparta.jpaquiz.application.dtos.PostRequestDto;
import com.sparta.jpaquiz.application.dtos.PostResponseDto;
import com.sparta.jpaquiz.application.dtos.UserDto;
import com.sparta.jpaquiz.application.service.PostService;
import com.sparta.jpaquiz.application.service.UserQueryService;
import org.springframework.stereotype.Service;

@Service
public class JsonPlaceholderApiClient implements UserQueryService, PostService {

    /**
     * @apiNote <a href="https://jsonplaceholder.typicode.com/users/1">유저 조회 외부 API</a>를 연동하여
     * userId 를 기준으로 유저를 조회 및 DB 에 연동하는 로직을 작성하세요.
     * @param userId 유저 ID
     */
    @Override
    public UserDto getUser(Long userId) {
        return null;
    }

    /**
     * @apiNote <a href="https://jsonplaceholder.typicode.com/posts">게시글 작성 외부 API</a>를 연동하여
     * 게시글 작성 API 를 연동하세요.<br/><a href="https://jsonplaceholder.typicode.com/guide/">가이드 문서</a> 참고
     */
    @Override
    public PostResponseDto addPost(PostRequestDto request) {

    }
}
