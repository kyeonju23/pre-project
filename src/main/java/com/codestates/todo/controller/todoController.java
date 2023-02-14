package com.codestates.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class todoController {
    @RequestMapping("/")
    @ResponseBody
    public String todoHello(){
        return "To-do Application";
    }
}
