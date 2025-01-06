package com.sparta.jpaquiz.application.service;

import com.sparta.jpaquiz.application.dtos.PostRequestDto;
import com.sparta.jpaquiz.application.dtos.PostResponseDto;

public interface PostService {
    PostResponseDto addPost(PostRequestDto request);
}
