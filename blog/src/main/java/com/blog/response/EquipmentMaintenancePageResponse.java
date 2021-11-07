package com.blog.response;

import com.blog.pojo.EquipmentMaintenance;
import com.blog.pojo.Maintenance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentMaintenancePageResponse {
    private int currentPage;
    private int totalPage;
    private List<EquipmentMaintenance> maintenances;
}
