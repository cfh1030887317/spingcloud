package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Autowired
    private StudentRepository studentRepository;

    @Value("${server.port}")  //服务一旦启动会返回端口号
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.savaOrupdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.savaOrupdate(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id) {
        studentRepository.delete(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前的端口号:" + this.port;
    }

}
