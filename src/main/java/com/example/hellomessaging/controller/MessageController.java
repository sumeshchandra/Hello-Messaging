package com.example.hellomessaging.controller;

import com.example.hellomessaging.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MessageController {

    @GetMapping(value = {  "","/", "/hello"})
    public String hello() {
        return "Hello Everyone !!";
//        return new <ResponseEntity<String>("Hello ", HttpStatus.OK);
    }

    // curl localhost:8080/hello/query?name=Sumesh
    @RequestMapping(value = "{/query", method = RequestMethod.GET)
    public String hello1(@RequestParam(value = "name") String name) {
        return "Hello " + name;
    }

    // curl localhost:8080/hello/param/Sumesh
    @GetMapping(value = "/param{name}")
    public String hello2(@PathVariable("name") String name) {
        return "Hello PathVariable " + name;
    }

    @PostMapping("/helloPost")
    public String helloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + ".";
    }

    @PutMapping("/helloPut/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName) {
        return "Hello, You are Great " + firstName + " " + lastName + " ..";
    }

}










