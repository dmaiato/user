package com.myproject.user.business;

import org.springframework.stereotype.Service;

import com.myproject.user.business.converter.UserConverter;
import com.myproject.user.business.dto.UserDTO;
import com.myproject.user.infrastructure.entity.User;
import com.myproject.user.infrastructure.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final UserConverter userConverter;

  public UserDTO saveUser(UserDTO userDTO) {
    User user = userConverter.toUser(userDTO);
    user = userRepository.save(user);
    return userConverter.toUserDTO(user);
  }
}
