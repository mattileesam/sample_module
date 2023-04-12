package com.example.ticket.basic;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/ticket")
public class helloController {

    @GetMapping("/create")
    public String createView(HttpServletRequest request, Model model) {
        String ticketName = request.getParameter("ticketName");
        String age = request.getParameter("age");

        return "ticketName="+ticketName+", age="+age;
    }

    @PostMapping("/getUser")
    public String getView(HttpServletRequest request, Model model) {
        String ticketName = request.getParameter("ticketName");
        String age = request.getParameter("age");

        return "ticketName="+ticketName+", age="+age;
    }
}
