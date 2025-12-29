package com.itheima.controller;

import com.itheima.service.StudentGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentGradeController {

    @Autowired
    private StudentGradeService studentGradeService;
    @GetMapping("/getStudentGrade")
    public String getStudentGrade(@RequestParam int score, @RequestParam boolean isAttendBonus) {
        return studentGradeService.getStudentGrade(score, isAttendBonus);
    }
}