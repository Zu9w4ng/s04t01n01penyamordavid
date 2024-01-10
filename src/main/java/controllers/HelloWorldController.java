package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class HelloWorldController {
    
    @GetMapping("/HelloWorld")
    @ResponseBody
    public String greet(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name)
    {
        return "Hola, " + name + ". Estàs executant un projecte Gradle";
    }

    @GetMapping(path="/HelloWorld/{name}")
    @ResponseBody
    public String greet2(@PathVariable(required = false) String name)
    {
        if(name == null)
            name = "UNKNOWN";
        return "Hola, " + name + ". Estàs executant un projecte Gradle";
    }
}