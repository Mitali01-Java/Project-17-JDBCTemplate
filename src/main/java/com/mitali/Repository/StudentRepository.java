package com.mitali.Repository;

import com.mitali.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public boolean SaveStudent(Student student) {
        String sql = "INSERT INTO student (rno, name, marks, city) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, student.getRno(), student.getName(), student.getMarks(), student.getCity()) > 0;
    }

    public int DeleteStudent(int srno){
        String sql="DELETE FROM student where rno=?";
        return jdbcTemplate.update(sql,srno);
    }

    public int UpdateStudent(Student student){
        String sql="Update student SET name=?,marks=?,city=? WHERE rno=?";
        return jdbcTemplate.update(sql,student.getName(),student.getMarks(),student.getCity(),student.getRno());
    }

    public Map<String,Object> GetStudentById(int srno){
        String sql="SELECT * FROM student where rno=?";
        return jdbcTemplate.queryForMap(sql,srno);
    }
    public List<Map<String,Object>> GetAllStudents(String scity){
        String sql="SELECT * FROM student where city=?";
        return jdbcTemplate.queryForList(sql,scity);
    }

//jjj


}
