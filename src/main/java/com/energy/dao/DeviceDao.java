package com.energy.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

public interface DeviceDao {
    public int count();
    List<Map<String,Object>> queryList();
}
