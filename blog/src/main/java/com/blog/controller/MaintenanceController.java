package com.blog.controller;

import com.blog.pojo.Maintenance;
import com.blog.pojo.Register;
import com.blog.response.MaintenancePageResponse;
import com.blog.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MaintenanceController {
    @Autowired
    private MaintenanceService maintenanceService;

    @GetMapping("/maintenance/findByPage")
    @ResponseBody
    public MaintenancePageResponse findByPage(int crrentPage, int pagesize) {
        return maintenanceService.findByPage(crrentPage, pagesize);
    }

    @GetMapping("/maintenance/updateStatus")
    @ResponseBody
    public String updateStatus(int id, int status) {
        return maintenanceService.updateStatus(id, status);
    }
}
