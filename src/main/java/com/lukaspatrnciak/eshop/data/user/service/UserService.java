package com.lukaspatrnciak.eshop.data.user.service;

import com.lukaspatrnciak.eshop.data.user.domain.User;

public interface UserService {
    User register(String email, String password, String name, String surname);
    User findUserByEmail(String email);
}
