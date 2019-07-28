package com.autotools.interfacegenerate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description 首页Controller
 * @author hongyuncao
 * @date 2019/07/28 13:34
 */
@Controller
public class indexController {

    @RequestMapping("/index")
    public String showInfo(Model model){
        model.addAttribute("msg","thymeleaf的第一个案例");
        return "index";
    }

}
