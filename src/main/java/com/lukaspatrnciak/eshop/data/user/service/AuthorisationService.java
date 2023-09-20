package com.lukaspatrnciak.eshop.data.user.service;

public interface AuthorisationService {
    boolean logIn(String email, String password);
}
