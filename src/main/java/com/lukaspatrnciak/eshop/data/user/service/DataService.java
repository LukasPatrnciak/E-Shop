package com.lukaspatrnciak.eshop.data.services;

import com.lukaspatrnciak.eshop.data.domain.User;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.HashMap;
import java.util.Map; // Rychlejsie vyhladavanie, zoradenie podla kluca

public class DataService implements AuthorisationService, UserService {
    private Map<String, User> users;

    public DataService() {
        this.users = new HashMap<String, User>();
    }

    @Override
    public User register(String email, String password, String name, String surname) {
        User user = new User(name, surname, email, hash(password));
        users.put(email, user);
        return user;
    }

    @Override
    public boolean logIn(String email, String password) {
        User user = findUserByEmail(email);

        if(user == null) {
            return false;
        }

        return user.getPassword().equals(hash(password));
    }

    @Override
    public User findUserByEmail(String email) {
        // return users.stream().filter(user -> user.getEmail().equals(email)).findFirst(); --- Pouzit v pripade Set
        return users.get(email);
    }

    protected String hash(String word) {
        return DigestUtils.sha256Hex(word);
    }
}
