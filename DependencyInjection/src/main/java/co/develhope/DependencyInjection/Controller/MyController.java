package co.develhope.DependencyInjection.Controller;

import co.develhope.DependencyInjection.Services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    public MyController(MyService myService) {
        System.out.println("I'm a controller");
        this.myService = myService;
    }
    @RequestMapping("/getName")
    public void getName() {
        myService.getMyComponentName();
    }
    @GetMapping
    public String helloMsg() {
        return "Welcome";
    }
}
