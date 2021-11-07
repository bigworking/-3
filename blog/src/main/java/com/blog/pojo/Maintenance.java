package com.blog.pojo;

import lombok.*;

import java.util.Date;


@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Maintenance {
    private int orderno;
    private Date ordertime;
    private String ordername;
    private int repairdevice;
    private String issuedescipt;
    private int repairstatus;
    private int repairpeople;
    private String repairtotal;
    private String repairdescipt;
    private Date havetime;
    private String descript;
    private Date agoto;
}