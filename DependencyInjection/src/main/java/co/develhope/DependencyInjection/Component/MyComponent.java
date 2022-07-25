package co.develhope.DependencyInjection.Component;

import org.springframework.stereotype.Component;
@Component
public class MyComponent {

    private String myComponentName;


    public MyComponent() {
        this.myComponentName = "myComponentName";
    }

    public String getMyComponentName() {
        return myComponentName;
    }
}
