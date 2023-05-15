package com.example.demo0720.controller;

import com.example.demo0720.mapper.ProjectBaseMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/project")
public class ProjectBaseController {

    @Resource
    private ProjectBaseMapper projectBaseMapper;

    @CrossOrigin(origins = "*")
    @GetMapping("/projectBase")
    public List<Map> test(String projectCode) {
        List<Map> list = projectBaseMapper.showProjectBase(projectCode);
        //System.out.println(list);
        return list;
    }


}
