package com.itheima.service.impl;

import com.itheima.dao.StudentGradeDao;
import com.itheima.service.StudentGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentGradeServiceImpl implements StudentGradeService {
    @Autowired
    private StudentGradeDao studentGradeDao;
    @Override
    public String getStudentGrade(int score, boolean isAttendBonus) {
        if (!studentGradeDao.isValidScore(score)) {
            return "成绩输入不合法";
        }
        int finalScore = studentGradeDao.calculateFinalScore(score, isAttendBonus);
        return studentGradeDao.getGradeByScore(finalScore);
    }
}