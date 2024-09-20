package com.zosh.service;

import com.zosh.exception.UserException;
import com.zosh.model.User;

import java.util.List;

public interface UserService {
    public User findUserById(Long userId) throws UserException;
    public User findUserProfileByJwt(String jwt) throws Exception;
    public List<User> findAllUsers();

}
