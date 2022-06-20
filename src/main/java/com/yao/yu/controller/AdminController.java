package com.yao.yu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yaozhan
 */
@Controller
public class AdminController {

    @RequestMapping("/toAdminHome")
    public String admin(){
        return "/backstage/adminHome";
    }

    @RequestMapping("/toAllStudentPage")
    public String toAllStudentPage(){
        return "/backstage/allStudent";
    }

    @RequestMapping("/toWelcome")
    public String toWelcome(){return  "/backstage/welcome01";}

}
