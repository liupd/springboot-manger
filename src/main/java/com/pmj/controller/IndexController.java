package com.pmj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by piaomingjie on 2017/8/31.
 */
@Controller
public class IndexController {
    /*param 跳转主页*/
    @RequestMapping("index")
    public String index(){
        return "index/index";
    }
    /*跳转到首页*/
    @RequestMapping("home")
    public String home(){return "index/home";}
}
