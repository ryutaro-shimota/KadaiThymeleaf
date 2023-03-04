package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {
    @PostMapping("/output")
    public String postOutput(@RequestParam("previus") String previus, Model model) {
        model.addAttribute("previus", previus);
        return "output";
    }
}