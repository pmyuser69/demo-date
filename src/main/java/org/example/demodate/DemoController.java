package org.example.demodate;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("Hello")
    public Response hello() {
        return new Response();
    }
}
