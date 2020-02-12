package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.Collection;


public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void savaOrupdate(Student student);
    public void delete(long id);
}
