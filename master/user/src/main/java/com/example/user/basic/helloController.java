package com.example.user.basic;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class helloController {

    @GetMapping("/create")
    public String createView(HttpServletRequest request, Model model) {
        String username = request.getParameter("username");
        String age = request.getParameter("age");

        return "username="+username+", age="+age;
    }

    @PostMapping("/getUser")
    public String getView(HttpServletRequest request, Model model) {
        String username = request.getParameter("username");
        String age = request.getParameter("age");

        return "username="+username+", age="+age;
    }
}
