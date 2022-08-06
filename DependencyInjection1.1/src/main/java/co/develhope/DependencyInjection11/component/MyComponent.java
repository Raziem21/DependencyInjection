package co.develhope.DependencyInjection11.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private final String myComponentName;

    public MyComponent() {
        this.myComponentName = "Emanuele";
    }

    public String getMyComponentName() {
        return myComponentName;
    }
}
