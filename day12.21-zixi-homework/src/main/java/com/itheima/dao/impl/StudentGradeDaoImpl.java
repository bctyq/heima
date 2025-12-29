package com.itheima.dao.impl;

import com.itheima.dao.StudentGradeDao;
import org.springframework.stereotype.Repository;

@Repository
public class StudentGradeDaoImpl implements StudentGradeDao {
    @Override
    public boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }
    @Override
    public int calculateFinalScore(int score, boolean isAttendBonus) {
        if (isAttendBonus) {
            return Math.min(score + 5, 100);
        }
        return score;
    }
    @Override
    public String getGradeByScore(int finalScore) {
        if (finalScore >= 90) {
            return "A 级";
        } else if (finalScore >= 80) {
            return "B 级";
        } else if (finalScore >= 70) {
            return "C 级";
        } else if (finalScore >= 60) {
            return "D 级";
        } else {
            return "E 级";
        }
    }
}