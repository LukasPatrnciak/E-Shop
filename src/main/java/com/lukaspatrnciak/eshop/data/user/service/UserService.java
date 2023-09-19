package com.lukaspatrnciak.eshop.data.services;

import com.lukaspatrnciak.eshop.data.domain.User;

public interface UserService {
    User register(String email, String password, String name, String surname);
    User findUserByEmail(String email);
}
