package com.blog.service.impl;

import com.blog.dao.EquipmentMaintenanceDao;
import com.blog.pojo.EquipmentMaintenance;
import com.blog.pojo.Maintenance;
import com.blog.response.EquipmentMaintenancePageResponse;
import com.blog.response.MaintenancePageResponse;
import com.blog.service.EquipmentMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EquipmentMaintenanceServiceImpl implements EquipmentMaintenanceService {
    @Autowired
    private EquipmentMaintenanceDao equipmentMaintenanceDao;

    @Override
    public EquipmentMaintenancePageResponse findByPage(int crrentPage, int pagesize) {
        List<EquipmentMaintenance> all = equipmentMaintenanceDao.findAll();
        int allsize = all.size();
        //计算筛选数据
        int start = (crrentPage - 1) * pagesize;
        int end = crrentPage * pagesize;
        List<EquipmentMaintenance> newList = new ArrayList<>();
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
        EquipmentMaintenancePageResponse equipmentMaintenancePageResponse = new EquipmentMaintenancePageResponse();
        equipmentMaintenancePageResponse.setMaintenances(newList);
        equipmentMaintenancePageResponse.setCurrentPage(crrentPage);
        equipmentMaintenancePageResponse.setTotalPage(allsize);//这里指总的记录条数
        return equipmentMaintenancePageResponse;
    }

    @Override
    public String updateStatus(int id, int status) {
        EquipmentMaintenance equipmentMaintenance = new EquipmentMaintenance();
        equipmentMaintenance.setProtectno(id);
        equipmentMaintenance.setProtectstatue(status);
        equipmentMaintenanceDao.updateById(equipmentMaintenance);
        return "ok";
    }
}
