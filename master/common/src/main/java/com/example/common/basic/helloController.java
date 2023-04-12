package com.example.common.basic;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/common")
public class helloController {

    @GetMapping("/create")
    public String createView(HttpServletRequest request, Model model) {
        String commonName = request.getParameter("commonName");
        String age = request.getParameter("age");

        return "common name="+commonName+", age="+age;
    }

    @PostMapping("/getUser")
    public String getView(HttpServletRequest request, Model model) {
        String commonName = request.getParameter("commonName");
        String age = request.getParameter("age");

        return "commonName="+commonName+", age="+age;
    }
}
