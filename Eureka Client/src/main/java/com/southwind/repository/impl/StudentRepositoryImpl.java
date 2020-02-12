package com.southwind.repository.impl;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long,Student> studentmap;

    static {
        studentmap = new HashMap<>();
        studentmap.put(1L,new Student(1L,"张三",18));
        studentmap.put(2L,new Student(2L,"李四",19));
        studentmap.put(3L,new Student(3L,"王五",20));
    }

    @Override
    public Collection<Student> findAll() {
        return studentmap.values();
    }

    @Override
    public Student findById(long id) {
        return studentmap.get(id);
    }

    @Override
    public void savaOrupdate(Student student) {
        studentmap.put(student.getId(),student);
    }

    @Override
    public void delete(long id) {
        studentmap.remove(id);
    }
}
