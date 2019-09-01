package com.example.demo;

import com.model.SearchParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/sayHello")
    public String getName(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getMultiParam")
    public SearchParam getMulti(SearchParam param)
    {
        return param;
    }
}
