package com.yao.yu;

import com.yao.yu.entity.Student;
import com.yao.yu.entity.User;
import com.yao.yu.mapper.StudentMapper;
import com.yao.yu.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class te {


    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test(){
        List<Student> list = studentMapper.selectList(null);
        list.forEach(System.out::println);
    }
}
