package com.blog.service.impl;
import com.blog.dao.repairMapper;
import com.blog.pojo.Maintenance;
//import com.blog.response.MaintenancePageResponse;
import com.blog.pojo.RepairAndTag;
import com.blog.pojo.Tag;
import com.blog.response.RepairPageResponse;
import com.blog.service.repairService;
//import com.repair.dao.repairMapper;
//import com.repair.pojo.repair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.HTML;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class repairServiceImpl implements repairService {
    @Autowired
    private repairMapper RepairMapper;


    //service调用Dao层：组合Dao
//    @Autowired
//    private repairMapper ;

//    public void setRepairMapper(repairMapper RepairMapper){
//        this.RepairMapper=RepairMapper;
//    }





    @Override
    public RepairPageResponse queryAllrepair(int crrentPage, int pagesize) {
        List<Maintenance> all = RepairMapper.queryAllrepair();
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
        //页数
        int page = allsize / pagesize;
        page = (allsize % pagesize) > 0 ? page + 1 : page;
        //重新组装
        RepairPageResponse repairPageResponse = new RepairPageResponse();
        repairPageResponse.setMaintenances(newList);
        repairPageResponse.setCurrentPage(crrentPage);
        repairPageResponse.setTotalPage(allsize);
        return repairPageResponse;
    }

    @Override
    public String addrepair(Maintenance maintenance) {
        maintenance.setAgoto(new Date());
        maintenance.setHavetime(new Date());
        maintenance.setOrdertime(new Date());
        RepairMapper.addrepair(maintenance);
//        Long orderno = Long.valueOf(maintenance.getOrderno());
//        List<Tag> tags=maintenance.getTags();
//        RepairAndTag repairAndTag = null;
//        for (Tag tag : tags) {
//            //新增时无法获取自增的id,在mybatis里修改
//            repairAndTag = new RepairAndTag(tag.getOrderno(), orderno);
//            RepairMapper.saveRepairAndTag(repairAndTag);
//        }
        return "ok";
    }

    @Override
    public int deleterepair(int orderno) {
        RepairMapper.deleterepair(orderno);
        return 1;
    }

    @Override
    public List<Maintenance> queryrepair(int orderno) {
        return RepairMapper.queryrepair(orderno);
    }

    @Override
    public String updaterepair(int orderno,Maintenance maintenance) {
//        maintenance = new Maintenance();
        maintenance.setOrderno(orderno);
        RepairMapper.updaterepair(maintenance);
        return "ok";
    }

    @Override
    public Maintenance qureyrepairid(String qureyrepairid) {
        return null;
    }


}
