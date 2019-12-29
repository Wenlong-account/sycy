package com.tea.sycy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/demo")
@Controller
public class DemoController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/**" )
    public String common(HttpServletRequest request ,Model model){

        return  request.getServletPath().replace("/demo/", "") ;
    }

}
