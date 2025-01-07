package com.sparta.jpaquiz.application.service.post;

import com.sparta.jpaquiz.application.dtos.post.PostRequestDto;
import com.sparta.jpaquiz.application.dtos.post.PostResponseDto;

public interface PostService {
    PostResponseDto addPost(PostRequestDto request);
}
