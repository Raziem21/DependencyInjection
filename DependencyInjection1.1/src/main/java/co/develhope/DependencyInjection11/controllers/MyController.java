package co.develhope.DependencyInjection11.controllers;

import co.develhope.DependencyInjection11.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    public MyController() {
        System.out.println("MyController constructor has been called");
    }

    @GetMapping("/getName")
    public String get() {
        System.out.println("/getName method has been called");
        return myService.getName();
    }

    @GetMapping
    public String helloMessage() {
        System.out.println("helloMessage method has been called");
        return "Hello";
    }

}
