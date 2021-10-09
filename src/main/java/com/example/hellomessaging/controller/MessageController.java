package com.example.hellomessaging.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MessageController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello Everyone !!";
    }

    @GetMapping(value = "/hello1")
    public String hello1(@RequestParam(value = "name") String name) {
        return "Hello " + name;
    }

    @GetMapping(value = "/hello2{name}")
    public String hello2(@PathVariable("name") String name) {
        return "Hello PathVariable " + name;
    }

    @PostMapping("/helloPost")
    public String helloPost(@RequestBody String fname, @RequestBody String lname) {
        return "Hello " + fname + " " + lname;
    }

    @PutMapping("/helloPut")
    public String helloPut(@PathVariable String firstName,
                           @RequestParam String lastName) {
        return "Hello, You are Great " + firstName + " " + lastName + " ..";
    }

}










