package com.sparta.jpaquiz.application.dtos.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostRequestDto {
    private String id;
    private String userId;
    private String title;
    private String body;
}
