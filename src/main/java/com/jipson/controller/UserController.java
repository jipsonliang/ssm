package com.jipson.controller;

import com.jipson.pojo.User;
import com.jipson.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 返回json数据
     * @return
     */
    @RequestMapping("/find")
    @ResponseBody
    public List<User> findUser(){
        return userService.findAllUser();
    }

    /**
     * 返回jsp页面
     * @param model
     * @return
     */
    @RequestMapping("/allUser")
    public String findUser1(Model model){
        List<User> user = userService.findAllUser();

        model.addAttribute("user", user);
        return "index.jsp";
    }
}
