package com.example.demo0720;

import com.example.demo0720.mapper.UserMapper;
import com.example.demo0720.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class Demo0720ApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void
    contextLoads() {
        System.out.println("userMapper:"+userMapper);
        List<User> userList = userMapper.selectList( null);
        //Assertions.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}
