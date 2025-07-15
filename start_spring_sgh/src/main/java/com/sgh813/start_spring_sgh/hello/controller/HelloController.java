package com.sgh813.start_spring_sgh.hello.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "hello"; //
    }
    @GetMapping("/hello2/{name}")
    public String hello2(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello2"; //
    }
    @GetMapping("/myself/{name}")
    public String myself(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        model.addAttribute("now", formattedDateTime);
        return "myself"; //
    }
    @GetMapping("/gugu")
    public String gugu(@RequestParam Integer gugudan, Model model) {
        StringBuilder gugudanString = new StringBuilder();
        for(int i=1;i<=9;i++){
            gugudanString.append(gugudan+"*"+i+"="+gugudan*i+"<br>");
        }
        model.addAttribute("gugudan",gugudanString.toString());
        return "gugu"; //
    }
    @GetMapping("/gugu2/{gugudan}")
    public String gugu2(@PathVariable Integer gugudan, Model model) {
        StringBuilder gugudanString = new StringBuilder();
        for(int i=1;i<=9;i++){
            gugudanString.append("<div>"+gugudan+"*"+i+"="+gugudan*i+"</div>");
        }
        model.addAttribute("gugudan",gugudanString.toString());
        return "gugu2"; //
    }
    @GetMapping("/loop_gugudan/{number}")
    public String loop_gugudan(@PathVariable Integer number, Model model) {
        List<String> gugudan = new ArrayList<>();
        for(int i=1;i<=9;i++){
            gugudan.add(number+"*"+i+"="+number*i);
        }
        model.addAttribute("gugudan",gugudan);
        return "loop_gugudan"; //
    }

}
