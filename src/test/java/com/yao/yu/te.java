package com.yao.yu;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
//        List<Student> list = studentMapper.selectList(null);
//        list.forEach(System.out::println);
        int updateById = studentMapper.updateById(new Student(27,14,"S1543329112844","张军","1221212","男","/StudentManagerSSM/photo/student.jpg","好学生"));
        System.out.println("updateById = " + updateById);

        Student byId = studentMapper.selectById(27);
        System.out.println("byId = " + byId);
    }

    @Test
    public void test1(){

//        Page<Student> page = new Page<>(1,3);
//        Page<Student> studentPage = studentMapper.selectPage(page, null);
//        System.out.println("studentPage = " + studentPage);
//        List<Student> list = page.getRecords();
//        list.forEach(System.out::println);

//        IPage<Student> iPage = studentMapper.getStudentPage(page);

//        List<Student> list = iPage.getRecords();
//        list.forEach(System.out::println);
    }
}
