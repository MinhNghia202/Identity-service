package com.devteria.identity_service.service;

import com.devteria.identity_service.dto.request.UserCreationRequest;
import com.devteria.identity_service.dto.request.UserUpdateRequest;
import com.devteria.identity_service.entity.User;
import com.devteria.identity_service.mapper.UserMapper;
import com.devteria.identity_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public User createRequest(UserCreationRequest request){
        if(userRepository.existsByUserName(request.getUserName()))
            throw new RuntimeException("Users already exist!");
        User user = userMapper.toUser(request);
        return userRepository.save(user);
    }

    public List<User> getUsers()
    {
        return userRepository.findAll();
    }

    public User getUser(String id)
    {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found!"));
    }
    public User updateUser(String userId, UserUpdateRequest request)
    {
        User user = getUser(userId);
        return userRepository.save(user);
    }

    public void deleteUser(String userId)
    {
        userRepository.deleteById(userId);
    }
}
