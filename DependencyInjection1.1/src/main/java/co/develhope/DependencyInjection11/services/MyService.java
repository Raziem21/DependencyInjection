package co.develhope.DependencyInjection11.services;

import co.develhope.DependencyInjection11.component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private final MyComponent myComponent;

    public MyService(MyComponent myComponent) {
        System.out.println("MyService constructor has been called");
        this.myComponent = myComponent;
    }

    public String getName() {
        return myComponent.getMyComponentName();
    }
}
