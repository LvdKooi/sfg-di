package nl.kooi.sfgdi.controllers;

import nl.kooi.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetterInjectedControllerTest {

    GetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new GetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}