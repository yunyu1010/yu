package com.yao.yu.controller;


import com.yao.yu.entity.User;
import com.yao.yu.service.IUserService;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yao
 * @since 2022-06-16
 */
//@RestController
@Controller
//@RequestMapping("users")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 注册接口
     *
     * @return
     */
    @RequestMapping(value = "/reg", method = RequestMethod.GET, headers = "Accept=application/json")
    public Runnable reg(@RequestBody User userEntity) {

//        int result = 1;
        Result result = new Result(-1,"error");

        List<User> u = userService.list();
        //获取所有用户名

        for (int i = 0; i < u.size(); i++) { //遍历用户名跟获取到的用户名比较
            if (u.get(i).getUsername().equals(userEntity.getUsername())) {
                result.setCode(0);   //用户名已经被注册
            }
        }
        if ("".equals(userEntity.getPassword())) {
            result.setCode(); = 2;    //密码不能为空
        } else if ("".equals(userEntity.getUsername())) {
            result = 3;    //账号不能为空
        }
        if (result == 1) {
            userService.register(userEntity);
        }
        return result;
    }


    /**
     * 登录接口
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result login(@RequestBody User userEntity) {
        Result result = new Result(-1, "error");
        //查询数据库中已经存在的用户名密码
        User u = userService.login(userEntity);

        if ("".equals(userEntity.getUsername()) || "".equals(userEntity.getPassword())) {
            result.setMsg("用户名或者密码错误"); //返回值为0前端提示用户名或者密码错误
        } else if (u == null) {
            result.setMsg("用户名或者密码错误"); //用户名不存在
        } else if (userEntity.getPassword().equals(u.getPassword())) {   //数据库中查询到的密码跟前端获取到的对比
            result.setCode(0);
            result.setMsg("login success");
        } else {
//            result = 0;
        }

        return result;

    }

    @Data
    @AllArgsConstructor
    public static class Result {
        private Integer code;
        private String msg;
    }

//
//    @GetMapping("/")
//    public String index() {
//        return "/index";
//    }
//

    @RequestMapping(value = "/tologin", method = RequestMethod.GET)
    public String tologin() {
        return "/login";
    }
//
//    public String login(@RequestParam("username")String username,
//                        @RequestParam("password")String password,
//                        Model model){
//        User user = new User();
//        user.setUsername(username);
//        user.setPassword(password);
//        System.out.println("user = " + user);
//
//        if (userService.login(user) != null){
//            model.addAttribute("login",user);
//            System.out.println("成功");
//            return "forword:/all";
//        }else {
//            model.addAttribute("error","账号或密码错误");
//            return "/login";
//        }
//    }
//
//
//    @RequestMapping("/toregister")
//    public String toregister() {
//        return "/register";
//    }
//
//    @RequestMapping("/register")
//    public String register(@RequestParam("name") String name,
//                           @RequestParam("password") String password) {
//        User user = new User();
//        user.setUsername(name);
//        user.setPassword(password);
//        userService.register(user);
//        return "/login";
//    }

}
