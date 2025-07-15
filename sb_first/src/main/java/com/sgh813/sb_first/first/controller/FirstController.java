package com.sgh813.sb_first.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FirstController {
    @GetMapping("/first/{number}")
    public String firstPage(@PathVariable Integer number ,Model model) {
       model.addAttribute("screenKey","First Page22");
       List<String> gugudan = new ArrayList<>();
       for(int i=1;i<=9;i++){
           gugudan.add(number+"*"+i+"="+number*i);
       }
       model.addAttribute("gugudan",gugudan);
       return "/first";
    }
}
