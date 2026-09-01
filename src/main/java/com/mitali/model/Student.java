package com.mitali.model;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class Student {
    private Integer rno;
    private String name;
    private Integer marks;
    private String city;

    public Student(int rno, String name, int marks, String city) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
        this.city = city;
    }
}
