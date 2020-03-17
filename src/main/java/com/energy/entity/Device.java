package com.energy.entity;


import lombok.Data;

@Data
public class Device {

    private String DEVICEID;
    private String DEVICENAME;
    private String SWITCHSTATUS;
    private String COMMUNICATESTAUS;
    private String DEVICETYPE;
    private String FAULT_STATUS;

}
