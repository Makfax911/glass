package com.example.TestSpring.Controlers;

import com.example.TestSpring.Models.Posts;
import com.example.TestSpring.repoo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

                @GetMapping("/add")
                public String Add(Model model){
                    Iterable<Posts> posts=postRepository.findAll();
                    model.addAttribute("post",posts);
                        return "add";
                }
    @PostMapping("/add")
    public  String post_add (@RequestParam String name,
                                    @RequestParam String characteristics,
                                    @RequestParam String description,
                                    @RequestParam int price, Model model){
                    Posts posts=new Posts(name,characteristics,description,price);
                    postRepository.save(posts);
        return "redirect:/post";
    }

}
