package rikkei.academy.service;

import rikkei.academy.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findALl();
    Student findById (long id);
    void save(Student student);
    void deleteById (long id);
}
