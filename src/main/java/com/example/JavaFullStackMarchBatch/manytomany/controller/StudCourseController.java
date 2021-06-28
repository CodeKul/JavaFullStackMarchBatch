package com.example.JavaFullStackMarchBatch.manytomany.controller;

import com.example.JavaFullStackMarchBatch.manytomany.domain.Courses;
import com.example.JavaFullStackMarchBatch.manytomany.domain.Student;
import com.example.JavaFullStackMarchBatch.manytomany.repository.CoursesRepo;
import com.example.JavaFullStackMarchBatch.manytomany.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudCourseController {

    @Autowired
    private CoursesRepo coursesRepo;

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping(value = "saveStudentCourse")
    public String saveStudentCourse(){
        Student student = new Student();
        student.setName("Akash");
        student.setAddress("Pune");

//        studentRepo.save(student);

        List<Courses>coursesList = new ArrayList<>();

        Courses obj1 = new Courses();
        obj1.setName("Physics");
        obj1.setCourseCode("P12");


        Courses obj2 = new Courses();
        obj2.setName("Math");
        obj2.setCourseCode("M12");

        Courses obj3 = new Courses();
        obj3.setName("Chemistry");
        obj3.setCourseCode("C12");

        coursesList.add(obj1);
        coursesList.add(obj2);
        coursesList.add(obj3);

        coursesRepo.saveAll(coursesList);

        student.setCourses(coursesList);

        studentRepo.save(student);
        return "saved ...";
    }
}
