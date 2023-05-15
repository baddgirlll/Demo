package com.example.demo0720.mapper;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo0720.entity.ProjectBase;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProjectBaseMessageMapper extends BaseMapper<ProjectBase> {
    public List<Map> showProjectBaseMessage(String projectCode);
}
