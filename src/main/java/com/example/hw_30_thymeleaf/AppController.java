package com.example.hw_30_thymeleaf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
@Slf4j
public class Controller {

    @GetMapping("/welcome")
    public String welcome(Model model) {
        return "welcome";
    }
}
