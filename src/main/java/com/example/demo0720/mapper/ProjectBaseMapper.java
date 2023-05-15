package com.example.demo0720.mapper;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo0720.entity.ProjectBase;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Description: 项目基础数据
 * @author： zp
 * @date： 2022-07-14
 * @version： V1.0
 */
@Mapper
public interface ProjectBaseMapper extends BaseMapper<ProjectBase> {

    public List<Map> showProjectBase(String projectCode);

}
