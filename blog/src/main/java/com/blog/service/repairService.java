package com.blog.service;

//import com.repair.pojo.repair;

import com.blog.pojo.Maintenance;
import com.blog.response.RepairPageResponse;

import java.util.List;

public interface repairService {

    RepairPageResponse queryAllrepair(int crrentPage, int pagesize);

    //增加
    String  addrepair(Maintenance maintenance);

    //删除
    int deleterepair(int odrderno);

    //查询
    List<Maintenance> queryrepair(int orderno);

    //修改
    String updaterepair(int orderno,Maintenance maintenance);


    //查询全部修理订单

//    Allrepair queryAllrepair(int crrentPage, int pagesize);

    Maintenance qureyrepairid( String qureyrepairid);
}
