package com.xy.controller;


import com.xy.dao.UserDao;
import com.xy.entity.User;
import com.xy.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by xy on 2016/12/22.
 */
@Controller
public class HelloController {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RedisService redisService;

    @RequestMapping("/")
    public String index(Model model){
        User u=new User("qwe");
        userDao.save(u);
        model.addAttribute("name","Ryan");
        return "index";
    }


    @RequestMapping("/help")
    public String hejp(Model model){

        model.addAttribute("name","Ryan");

        return "test/help";
    }


    @RequestMapping("/redis/set")
    public String redisSet(@RequestParam("value")String value){
        boolean isOk = redisService.set("name", value);
        return "index";
    }
}
