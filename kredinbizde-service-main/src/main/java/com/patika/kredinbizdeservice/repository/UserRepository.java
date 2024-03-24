package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.factory.ApplicationFactory;
import com.patika.kredinbizdeservice.factory.UserFactory;
import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private final List<User> userList = UserFactory.getInstance().getUserList();

    public void save(User user) {
        userList.add(user);
    }

    public List<User> getAll() {
        return userList;
    }

    public Optional<User> findByEmail(String email) {
        return userList.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    public void delete(User user) {
        userList.remove(user);
    }
}
