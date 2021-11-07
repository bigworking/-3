package com.blog.service;

import com.blog.response.MaintenancePageResponse;

public interface MaintenanceService {
    MaintenancePageResponse findByPage(int crrentPage, int pagesize);

    String updateStatus(int id, int status);
}
