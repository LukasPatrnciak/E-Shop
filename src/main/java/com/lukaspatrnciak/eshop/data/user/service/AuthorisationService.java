package com.lukaspatrnciak.eshop.data.services;

public interface AuthorisationService {
    boolean logIn(String email, String password);
}
