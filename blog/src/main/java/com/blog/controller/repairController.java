package com.blog.controller;

//import com.blog.response.MaintenancePageResponse;
//import com.blog.service.impl.repairServiceImpl;
import com.blog.dao.repairMapper;
import com.blog.pojo.Maintenance;
import com.blog.response.RepairPageResponse;
import com.blog.service.repairService;
//import com.repair.pojo.repair;
//import com.repair.service.repairService;
//import com.repair.service.repairServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sun.applet.Main;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/repair")
public class repairController {
      //controller 调 service 层
    @Autowired
//    @Qualifier("repairServiceImpl")
    private repairService RepairService;

    //查询维修管理数据库表的所有信息
    @GetMapping ("/repair/allrepair")
    @ResponseBody
    public RepairPageResponse queryAllrepair(int crrentPage, int pagesize) {
        return RepairService.queryAllrepair(crrentPage, pagesize);
    }

    @PostMapping("/repair/addrepair")
    @ResponseBody//新增
    public String addrepair(@RequestBody Maintenance maintenance){
        return RepairService.addrepair(maintenance);
    }

    @DeleteMapping("/repair")
    @ResponseBody
    public int deleterepair(int orderno){
//        RepairService.deleterepair(orderno);
//        attributes.addFlashAttribute("msg", "删除成功");
        return RepairService.deleterepair(orderno);
    }

    @GetMapping("/repair/look")
    @ResponseBody
    public List<Maintenance> queryrepair(int orderno){
        return RepairService.queryrepair(orderno);
    }


    @PostMapping("/repair/update")
    @ResponseBody
    public String updaterepair(@RequestParam int orderno, @RequestBody Maintenance maintenance) {
        return RepairService.updaterepair(orderno,maintenance);
    }
//    public String list(Model model){
//        List<repair> list= RepairService.queryAllrepair();
//
//        model.addAttribute("list",list);
//        return "repair";
//    }


//    @RequestMapping("/toAddrepair")
//    //跳转到增加新维修单页面
//    public String toAddrepair(){
//        return "addrepair";
//    }
//
//
//    @RequestMapping("/addrepair")
//    //添加新维修单的请求
//    public  String addrepair(Maintenance maintenance){
//        System.out.println("addrepair=>"+Repair);
//        RepairService.addrepair(Repair);
//        return "redirect:/repair/allrepair";//重定向到@RequestMapping("/allrepair")请求.
//
//    }

//    @RequestMapping("/updaterepair")
    //跳转到修改页面
//    public String toUpdatePaper( int id,Model model){
//        maintenance maintenance= RepairService.queryrepair(id);
//        model.addAttribute("qrepair",maintenance);
//        return  "updaterepair";
//    }

//    @RequestMapping("/rupdaterepair")
//    //修改维修订单
//    public String updaterepair(repair repair){
//        System.out.println("updaterepair=>"+repair);
//
//        RepairService.updaterepair(repair);
//        return "redirect:/repair/allrepair";//修改完，重定向到首页查询。
//    }
//
//    @RequestMapping("/deleterepair")
//    //删除维修订单
//    public  String deleterepair(int id){
//        RepairService.deleterepair(id);
//        return "redirect:/repair/allrepair";//删除完，重定向到首页查询。
//
//    }
//
//    @RequestMapping("/qureyrepair")
//    //搜索框查询某一维修订单
//    public String qureyrepair(String qureyrepairid,Model model){
//        repair repair =RepairService.qureyrepairid(qureyrepairid);
//
//        List<repair> list =new ArrayList<repair>();
//
//        list.add(repair);
//
//
//        model.addAttribute("list",list);
//        return "allrepair";
//    }




}
