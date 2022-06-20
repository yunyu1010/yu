package com.yao.yu.controller;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yao.yu.entity.PageInfo;
import com.yao.yu.entity.Student;
import com.yao.yu.mapper.StudentMapper;
import com.yao.yu.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;


@Controller
public class PageController {

    @Autowired
    private StudentMapper studentMapper;

//    @RequestMapping("/qureyAllByPage")
//    public String qureyAllByPage(Model model,Integer current,long size){
//
//
//        Page<Student> page = new Page<>(1,3);
//        studentMapper.selectPage(page,null);
//        List<Student> pages = page.getRecords();
//
//        model.addAttribute("pages",pages);
//        return "/all";
//    }

//    @RequestMapping("/pages")
//    public String getPage(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
//
//    }
}


