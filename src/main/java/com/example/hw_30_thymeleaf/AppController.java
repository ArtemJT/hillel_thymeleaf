package com.example.hw_30_thymeleaf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class AppController {

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("hello", "Hello");
        return "welcome";
    }

    @GetMapping("/info")
    public String info(Model model) {
        model.addAttribute("time", System.currentTimeMillis());
        return "info";
    }
}
