package com.epam.epetrov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Evgeniy_Petrov on 5/30/2016.
 */
@Controller
public class JspController {

    @RequestMapping("/jsptest")
    public String test(ModelAndView modelAndView){

        return "jsp-spring-boot";
    }
}
