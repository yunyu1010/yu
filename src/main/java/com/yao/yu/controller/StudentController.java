package com.yao.yu.controller;


import com.yao.yu.entity.Student;
import com.yao.yu.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yao
 * @since 2022-06-16
 */
@Controller
//@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/all")
    public ModelAndView addStudent(){
        ModelAndView view = new ModelAndView();
        List<Student> list = studentMapper.selectList(null);
        list.forEach(System.out::println);
        view.addObject("list",list);
        view.setViewName("all");
        return view;
    }
}
