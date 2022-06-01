package com.jrg.ead.authuser.services.impl;

import com.jrg.ead.authuser.repositories.UserRepository;
import com.jrg.ead.authuser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
}
