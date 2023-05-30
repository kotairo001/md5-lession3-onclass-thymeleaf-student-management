package rikkei.academy.service;

import rikkei.academy.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService {
    public static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"Thu","Yen Bai", 2));
        studentList.add(new Student(2,"Chuan","Nam Dinh", 3));
        studentList.add(new Student(3,"Yen","Ha Noi", 4));
        studentList.add(new Student(4,"Son","Thach That", 5));
    }

    @Override
    public List<Student> findALl() {
        return studentList;
    }

    @Override
    public Student findById(long id) {
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId()==id){
                return studentList.get(i);
            }
        }
        return null;
    }

    @Override
    public void save(Student student) {
        if(findById(student.getId())==null){
            studentList.add(student);
        } else {
            int index = studentList.indexOf(findById(student.getId()));
            studentList.set(index, student);
        }

    }

    @Override
    public void deleteById(long id) {
        Student student = findById(id);
        studentList.remove(student);
    }
}
