package com.sha.springbootproductstore.service;

import com.sha.springbootproductstore.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
