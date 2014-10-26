package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = {"","/"})
    @ResponseBody
    public String root(){
        return "Got to root";
    }

    @RequestMapping(value="/secure")
    @ResponseBody
    public String secure(){
        return "Got to secure endpoint";
    }

    @RequestMapping(value="/about")
    @ResponseBody
    public String about(){
        return "its all about me";
    }
}
