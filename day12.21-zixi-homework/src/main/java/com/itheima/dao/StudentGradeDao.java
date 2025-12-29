package com.itheima.dao;

public interface StudentGradeDao {
    boolean isValidScore(int score);
    int calculateFinalScore(int score, boolean isAttendBonus);
    String getGradeByScore(int finalScore);
}