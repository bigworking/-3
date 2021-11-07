package com.blog.dao;

import com.blog.pojo.EquipmentMaintenance;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EquipmentMaintenanceDao {
    List<EquipmentMaintenance> findAll();

    void updateById(EquipmentMaintenance maintenance);
}
