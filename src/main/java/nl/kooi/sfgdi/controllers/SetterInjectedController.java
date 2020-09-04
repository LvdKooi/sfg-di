package nl.kooi.sfgdi.controllers;

import lombok.Setter;
import nl.kooi.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    @Setter
    @Qualifier("setterInjectedGreetingService")
    @Autowired
    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
