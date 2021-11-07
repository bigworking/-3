package com.blog.service.impl;

import com.blog.dao.MaintenanceDao;
import com.blog.pojo.Maintenance;
import com.blog.response.MaintenancePageResponse;
import com.blog.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {
    @Autowired
    private MaintenanceDao maintenanceDao;

    @Override
    public MaintenancePageResponse findByPage(int crrentPage, int pagesize) {
        List<Maintenance> all = maintenanceDao.findAll();
        int allsize = all.size();
        //计算筛选数据
        int start = (crrentPage - 1) * pagesize;
        int end = crrentPage * pagesize;
        List<Maintenance> newList = new ArrayList<>();
        if (allsize >= start) {
            for (int i = start; i < end; i++) {
                try {
                    newList.add(all.get(i));
                } catch (Exception e) {
                    break;
                }
            }
        }
        //重新组装
        MaintenancePageResponse maintenancePageResponse = new MaintenancePageResponse();
        maintenancePageResponse.setMaintenances(newList);
        maintenancePageResponse.setCurrentPage(crrentPage);
        maintenancePageResponse.setTotalPage(allsize);//这里指总的记录条数
        return maintenancePageResponse;
    }

    @Override
    public String updateStatus(int id, int status) {
        Maintenance maintenance = new Maintenance();
        maintenance.setOrderno(id);
        maintenance.setRepairstatus(status);
        maintenanceDao.updateById(maintenance);
        return "ok";
    }
}