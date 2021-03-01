package me.survivalking.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/my")
    public String test(){
        return "my";
    }

}
