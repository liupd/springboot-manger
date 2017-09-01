package com.pmj.controller;

import com.pmj.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by piaomingjie on 2017/8/23.
 */
@Controller
public class LoginController {
    /**跳转到登陆页面*/
    @RequestMapping("login")
    public String goLogin(){
        return "login/login";
    }


    @ResponseBody
    @RequestMapping("/loginUser")
    public String loginUser(String username,String password,HttpSession session,Map<String,Object> map) {
        System.out.println(username);
        System.out.println(password);
        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(username,password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(usernamePasswordToken);   //完成登录
            User user=(User) subject.getPrincipal();
            session.setAttribute("user", user);
            map.put("hello","from TemplateController.helloHtml");
            return "success";
        } catch(Exception e) {
            return "Error";//返回登录页面
        }

    }
    //退出
    @RequestMapping("/logOut")
    public String logOut(HttpSession session) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
//        session.removeAttribute("user");
        return "login";
    }
}
