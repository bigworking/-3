package com.blog.service;

import com.blog.pojo.Register;

public interface RegisterService {
    Register login(String username, String password);
}