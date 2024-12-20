package spring.demo.springbootnewproject.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class demoController {
    @GetMapping("/api")
    public String getMethodName(@RequestParam String name) {
        System.out.println("Ajay Balaji");
        return "Hello" + name;
    }
    
@GetMapping("/api/{demo}")
public String getMethodName1(@PathVariable("demo") String name) {
    return "Hello "+name;
}

/*@GetMapping("/api/{name}")
public String getMethodName1(@PathVariable String name) {
    return "Hello "+name;
}
 */   
}
    
