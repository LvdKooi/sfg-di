package nl.kooi.sfgdi.controllers;

import lombok.RequiredArgsConstructor;
import nl.kooi.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class MyController {

    private final GreetingService greetingService;

    public String hello() {
        System.out.println("Hello!!! ");

        return greetingService.sayGreeting();
    }
}
