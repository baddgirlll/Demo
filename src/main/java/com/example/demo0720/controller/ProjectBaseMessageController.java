package com.example.demo0720.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo0720.mapper.ProjectBaseMapper;
import com.example.demo0720.mapper.ProjectBaseMessageMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/project")
public class ProjectBaseMessageController {

    @Resource
    private ProjectBaseMessageMapper projectBaseMessageMapper;

    @GetMapping("/projectBaseMessage")
    public List<Map> test(String projectCode) {
        List<Map> list = projectBaseMessageMapper.showProjectBaseMessage(projectCode);
        //System.out.println(list);

        return list;
    }


}
