package com.example.demo0720.task;

import com.example.demo0720.mapper.ProjectTypeNumMapper;
import lombok.Data;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Component
@ConfigurationProperties(prefix = "type")
@Data
public class ProjectTypeNum {

    private String type_1;
    private String type_2;
    private String type_3;
    private String type_4;
    private String type_5;
    private String type_6;
    private String type_7;
    private String type_8;
    private String type_9;

    public List<Map> sendTaskResult(List<Map> data) {

        data.get(0).replace("projectType",1,type_1);
        data.get(1).replace("projectType",2,type_2);
        data.get(2).replace("projectType",3,type_3);
        data.get(3).replace("projectType",4,type_4);
        data.get(4).replace("projectType",5,type_5);
        data.get(5).replace("projectType",6,type_6);
        data.get(6).replace("projectType",7,type_7);
        data.get(7).replace("projectType",8,type_8);
        data.get(8).replace("projectType",9,type_9);

        return data;
    }

}
