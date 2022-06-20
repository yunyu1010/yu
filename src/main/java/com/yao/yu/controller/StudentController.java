package com.yao.yu.controller;


import com.yao.yu.entity.Student;
import com.yao.yu.entity.StudentData;
import com.yao.yu.mapper.StudentMapper;
import com.yao.yu.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private IStudentService studentService;

//
//    @RequestMapping("/allStudent")
//    public ModelAndView addStudent(){
//        ModelAndView view = new ModelAndView();
//        List<Student> list = studentMapper.selectList(null);
//        list.forEach(System.out::println);
//        view.addObject("list",list);
//        view.setViewName("allStudent");
//        return view;
//    }

    @RequestMapping("/allStudent")
    @ResponseBody
    public StudentData addStudent(){
        List<Student> list = studentMapper.selectList(null);
        StudentData s = new StudentData();
        s.setCode(0);
        s.setCount(list.size());
        s.setData(list);
        s.setMsg("OK");
        return s;
    }
    /**
     * 修改数据
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/toUpdateBook/{id}",method = RequestMethod.GET)
    public String toUpdate(@PathVariable String id, Model model){
        Student byId = studentMapper.selectById(id);
        System.out.println("byId = " + byId);
        model.addAttribute("byId",byId);
        return "/backstage/updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model, Student student) {

        System.out.println("student = " + student);
        studentMapper.updateById(student);
        Student byId = studentMapper.selectById(student.getId());
        model.addAttribute("byId",byId);
        return "redirect:/allStudent";
    }

    /**
     * 添加学生信息
     * @return
     */
    @RequestMapping(value = "/addBook",method = RequestMethod.GET)
    public String AddBook(){
        return "addBook";
    }

    @RequestMapping(value = "/addBook",method = RequestMethod.POST)
    public String getAddBook(Student student){
        int insert = studentMapper.insert(student);
        System.out.println("student = " + insert);
        return "redirect:/allStudent";
    }

    @RequestMapping(value = "toDelete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable String id){
        int byId = studentMapper.deleteById(id);
        System.out.println("byId = " + byId);
        return "redirect:/allStudent";
    }




}
