package com.cssresptalk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PrimaryController {

    @RequestMapping(value = {"/", "/index"})
    public String index(Model model) throws Exception {
        return "index";
    }

    @RequestMapping("/top**")
    public String top() {
        return "top";
    }

    @RequestMapping("/right**")
    public String right() {
        return "right";
    }

    @RequestMapping("/bottom**")
    public String bottom() {
        return "bottom";
    }

    @RequestMapping("/left**")
    public String left() {
        return "left";
    }

    @RequestMapping("/about**")
    public String about() {
        return "about";
    }

    @RequestMapping("/contact**")
    public String contact() {
        return "contact";
    }







    //errors:
    @ExceptionHandler
    public String error(Exception e) throws Exception {
        return "error";
    }

}

