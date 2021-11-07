package com.blog.dao;

import com.blog.pojo.Maintenance;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MaintenanceDao {
    List<Maintenance> findAll();

    void updateById(Maintenance maintenance);
}