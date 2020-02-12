package com.southwind.fiegn;

import com.southwind.entity.Student;
import com.southwind.fiegn.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.rmi.StubNotFoundException;
import java.util.Collection;

@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();

}
