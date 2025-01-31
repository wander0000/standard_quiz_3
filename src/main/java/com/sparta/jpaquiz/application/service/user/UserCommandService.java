package com.sparta.jpaquiz.application.service.user;

import com.sparta.jpaquiz.application.dtos.user.UserResponseDto;
import com.sparta.jpaquiz.domain.entity.User;
import com.sparta.jpaquiz.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserCommandService {
    private final UserRepository userRepository;

    public UserCommandService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User addUser(UserResponseDto request) {
        return userRepository.save(User.create(
            request.getName(),
            request.getUsername(),
            request.getEmail(),
            request.getAddress().getStreet() + ' ' + request.getAddress().getSuite(),
            request.getAddress().getZipcode(),
            request.getPhone()
        ));
    }
}
