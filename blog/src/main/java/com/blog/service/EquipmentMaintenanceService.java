package com.blog.service;

import com.blog.response.EquipmentMaintenancePageResponse;

public interface EquipmentMaintenanceService {
    EquipmentMaintenancePageResponse findByPage(int crrentPage, int pagesize);

    String updateStatus(int id, int status);
}
