package com.sparta.jpaquiz.application.service;

import com.sparta.jpaquiz.application.dtos.UserRequestDto;
import com.sparta.jpaquiz.domain.entity.User;
import com.sparta.jpaquiz.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserCommandService {
    private final UserRepository userRepository;

    public UserCommandService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User addUser(UserRequestDto request) {
    }
}
