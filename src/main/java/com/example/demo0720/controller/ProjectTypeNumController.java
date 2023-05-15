package com.example.demo0720.controller;

import com.example.demo0720.mapper.ProjectTypeNumMapper;
import com.example.demo0720.task.ProjectTypeNum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/project")
public class ProjectTypeNumController {

    @Resource
    private ProjectTypeNumMapper projectTypeNumMapper;

    @Autowired
    private ProjectTypeNum projectTypeNum;


    @GetMapping("/projectTypeNum")
    public List<Map> test() {
        List<Map> list = projectTypeNumMapper.showProjectTypeNum();
        return projectTypeNum.sendTaskResult(list);
    }
}
