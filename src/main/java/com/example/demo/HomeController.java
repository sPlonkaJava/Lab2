package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }
    @RequestMapping("/example2/{name}/{age}")
    @ResponseBody
    public String example2
            (
            @PathVariable String name,
            @PathVariable Integer age,
            @RequestParam (required = false) String p1,
            @RequestParam (required = false) String p2

            ) {
        return "example2 "+name+" ma "+age+" p1 "+p1+p2;
    }
}