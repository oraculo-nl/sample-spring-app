package nl.javaacademy.sample.spring.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping("/hello-world")
    public String getWelcomeMessage() {

        return "Hello World...!!!";
    }
}
