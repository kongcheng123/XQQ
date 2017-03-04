package com.xy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xy on 2017/3/4.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/")
    public String getAdmin(Model model){
        return "admin/index";
    }

}
