package co.develhope.DependencyInjection.Services;

import co.develhope.DependencyInjection.Component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        System.out.println("This is my service");
        this.myComponent = myComponent;
    }

    public String getMyComponentName() {
        return myComponent.getMyComponentName();
    }
}
