package ch.babloom.babloomshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("api")
    public MyData getData() {
        return new MyData("Hello from Babloom's Webshop!");
    }
}
