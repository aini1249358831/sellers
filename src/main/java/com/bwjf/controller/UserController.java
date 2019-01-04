package com.bwjf.controller;
import com.bwjf.entity.User;
import com.bwjf.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @RequestMapping("/loginView")
    public String index(String username, String password, HttpSession httpSession){
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            System.out.println(subject.getPrincipal());
        try{
            subject.login(token);
            if(subject.getPrincipal()==null){
                logger.error("身份为空");
                return "/login";
            }
            User user = (User) subject.getPrincipal();
            httpSession.setAttribute("user",user);
            return "/index";

        }
        catch(AuthenticationException e){
            System.out.println("发生异常");
            return "/login";
        }
    }
    @RequestMapping("/login")
    public String login(){

        return "login";
    }


}
