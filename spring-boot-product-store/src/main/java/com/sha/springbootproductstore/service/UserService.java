package com.sha.springbootproductstore.service;

import com.sha.springbootproductstore.model.Role;
import com.sha.springbootproductstore.model.User;

import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
