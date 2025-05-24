package com.rosito.service;

import com.rosito.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
