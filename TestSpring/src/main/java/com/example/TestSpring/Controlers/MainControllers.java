package com.example.TestSpring.Controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControllers {
    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title","Головна сторінка");
        return "home";
    }
    @GetMapping("/Iphone6")
    public String about( Model model) {
        model.addAttribute("title","Скло для iPhone");
        return "Iphone6";
    }
    @GetMapping("/basket")
    public String basket(Model model){
        model.addAttribute("title","Корзтна");
        return "basket";



    }

}
