package com.sparta.jpaquiz.userInterface;

import com.sparta.jpaquiz.application.dtos.post.PostRequestDto;
import com.sparta.jpaquiz.application.dtos.post.PostResponseDto;
import com.sparta.jpaquiz.application.dtos.user.UserDto;
import com.sparta.jpaquiz.application.service.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class QuizController {
    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping("/users/{userId}")
    public ResponseEntity<UserDto> createUser(@PathVariable Long userId) {
        UserDto dto = quizService.createUser(userId);
        return ResponseEntity.ok(dto);
    }

    @PostMapping("/posts")
    public ResponseEntity<PostResponseDto> addPost(@RequestBody PostRequestDto request) {
        PostResponseDto response = quizService.addPost(request);
        return ResponseEntity.ok(response);
    }


}
