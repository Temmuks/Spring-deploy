package com.Spring_deploy.Spring_deploy;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller {
    
    @GetMapping("/")
    public String getIndex() {
        return "{'Message': 'Hello World!'}";
    }
    

}
