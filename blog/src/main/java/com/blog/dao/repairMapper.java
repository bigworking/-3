package com.blog.dao;
//import com.blog.pojo.repair;
import com.blog.pojo.Maintenance;
import com.blog.pojo.RepairAndTag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface repairMapper {

    //增加



    //查询全部修理订单

//    List<repair> queryAllrepair();

    List<Maintenance> queryAllrepair();

    //增加
    int addrepair(Maintenance maintenance);


//    int saveRepairAndTag(RepairAndTag repairAndTag);

    //删除
    int deleterepair(int orderno);


    //查询
    List<Maintenance> queryrepair(int orderno);

    //修改
    int updaterepair(Maintenance maintenance);

}
