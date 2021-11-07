package com.blog.controller;

import com.blog.response.EquipmentMaintenancePageResponse;
import com.blog.service.EquipmentMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EquipmentMaintenanceController {
    @Autowired
    private EquipmentMaintenanceService equipmentMaintenanceService;

    @GetMapping("/equipmentMaintenance/findByPage")
    @ResponseBody
    public EquipmentMaintenancePageResponse findByPage(int crrentPage, int pagesize) {
        return equipmentMaintenanceService.findByPage(crrentPage, pagesize);
    }

    @GetMapping("/equipmentMaintenance/updateStatus")
    @ResponseBody
    public String updateStatus(int id, int status) {
        return equipmentMaintenanceService.updateStatus(id, status);
    }
}
