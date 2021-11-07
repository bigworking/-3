package com.blog.dao;

import com.blog.pojo.Register;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RegisterDao {
    Register findByUsernameAndPassword(String username, String password);
}
