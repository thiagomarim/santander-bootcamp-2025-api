package me.dio.santander_bootcamp_2025_api.service;

import me.dio.santander_bootcamp_2025_api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}