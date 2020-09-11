package nl.kooi.sfgdi;

import nl.kooi.sfgdi.controllers.ConstructorInjectedController;
import nl.kooi.sfgdi.controllers.GetterInjectedController;
import nl.kooi.sfgdi.controllers.MyController;
import nl.kooi.sfgdi.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).getGreeting());
        System.out.println(ctx.getBean(GetterInjectedController.class).getGreeting());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreeting());
    }

}
