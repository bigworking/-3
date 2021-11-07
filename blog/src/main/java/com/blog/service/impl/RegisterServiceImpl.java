package com.blog.service.impl;

import com.blog.dao.RegisterDao;
import com.blog.pojo.Register;
import com.blog.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterDao registerDao;
    @Override
    public Register login(String username, String password) {
        return registerDao.findByUsernameAndPassword(username,password);
    }
}
