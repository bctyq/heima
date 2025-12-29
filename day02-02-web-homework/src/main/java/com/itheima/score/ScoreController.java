package com.itheima.score;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {

    @GetMapping("/setScore")
    public String setScore(@RequestParam(required = false) String score) {
        try {
            // 检查参数是否为空
            if (score == null || score.isEmpty()) {
                return "请输入有效的成绩数据";
            }
            // 转换为数字
            double scoreValue = Double.parseDouble(score);
            // 判断成绩范围并返回相应结果
            if (scoreValue >= 90 && scoreValue <= 100) {
                return "优";
            } else if (scoreValue >= 80 && scoreValue < 90) {
                return "良";
            } else if (scoreValue >= 70 && scoreValue < 80) {
                return "中";
            } else if (scoreValue >= 60 && scoreValue < 70) {
                return "及格";
            } else if (scoreValue >= 0 && scoreValue < 60) {
                return "不及格";
            } else {
                return "成绩超出有效范围";
            }
        } catch (NumberFormatException e) {
            return "请输入有效的成绩数据";
        }
    }
}
