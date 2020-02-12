package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.fiegn.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.Style;
import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @RequestMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @RequestMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
