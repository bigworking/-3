package com.blog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentMaintenance {
    private int protectno;
    private Date protecttime;
    private int protectcode;
    private String protectcontent;
    private int protectstatue;
    private String protectpeople;
    private String protectprice;
    private String protectdescribe;
    private Date protectfinishtime;
    private String prodescribe;
    private Date progoto;
}
