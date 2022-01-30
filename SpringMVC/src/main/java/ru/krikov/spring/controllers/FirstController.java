package ru.krikov.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/calc")
    public String calculate(@RequestParam(value = "a", required = false) int a,
                            @RequestParam(value = "b", required = false) int b,
                            @RequestParam(value = "op", required = false) String op,
                            Model model) {
        System.out.println("Op = " + op);
        System.out.println("HERE");
        if (Objects.equals(op, "plus")) {
            model.addAttribute("res", a + b);
            System.out.println("HERE2");
        } else {
            model.addAttribute("res", a - b);
            System.out.println("HERE3");
        }

        return "first/calc";
    }

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "age", required = false) String age, Model model) {
        System.out.println("name = " + name + " and age = " + age);
        model.addAttribute("msg", name + " age = " + age);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}
