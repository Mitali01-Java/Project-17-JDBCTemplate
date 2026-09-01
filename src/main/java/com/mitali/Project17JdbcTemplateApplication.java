package com.mitali;

import com.mitali.Repository.StudentRepository;
import com.mitali.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Project17JdbcTemplateApplication {

    public static void main(String[] args) {
        ApplicationContext  applicationContext =SpringApplication.run(Project17JdbcTemplateApplication.class, args);
        StudentRepository studentRepository = applicationContext.getBean(StudentRepository.class);
        //City wise list of students
        List<Map<String,Object>> students = studentRepository.GetAllStudents("MUMBAI");
        for(Map<String,Object> student:students){
            System.out.println(student);
        }

        /*
        //DDL - execute() CREATE,DROP,ALTER,TRUNCATE
        //select operation -----|-- single Row :queryforMap() -- return list of objects
                                |
                                |
                                -- Mutiple Rows : queryForList() --- return List of map object
            //All Students
            List<Map<String,Object>> students = studentRepository.GetAllStudents();
            for(Map<String,Object> student:students){
            System.out.println(student);
            }

           // Student By Id
           Map<String,Object> student = studentRepository.GetStudentById(4);
            System.out.println(student);


        //DML -update() Insert,Update, Delete
        //update
        Student student = new Student(4,"DD",97,"MUMBAI");
        int RowsAffected = studentRepository.UpdateStudent(student);
        if(RowsAffected>0){
            System.out.println("Student updated successfully");
        }else {
            System.out.println("Student not updated");
        }

        //delete
        int RowsAffected = studentRepository.DeleteStudent(5);
        if(RowsAffected>0){
            System.out.println("Student deleted successfully");
        }else {
            System.out.println("Student not deleted");
        }

        //Insert
        Student student = new Student(5,"EE",97,"DELHI");
        boolean result = studentRepository.SaveStudent(student);
        if(result){
            System.out.println("Student saved successfully");
        }else {
            System.out.println("Student not saved");
        }

        */



    }

}
