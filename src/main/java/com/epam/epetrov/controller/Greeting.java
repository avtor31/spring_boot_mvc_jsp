package com.epam.epetrov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Evgeniy_Petrov on 5/30/2016.
 */
@Controller
public class Greeting {

    @RequestMapping("/greeting")
    public @ResponseBody String greeting() {
        return "hello";
    }
}
