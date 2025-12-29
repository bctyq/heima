package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeStageController {
    
    @GetMapping("/getAgeStage")
    public String getAgeStage(@RequestParam int age) {
        if (age < 0 || age > 120) {
            return "输入的年龄不合法";
        } else if (age >= 0 && age <= 3) {
            return "婴儿";
        } else if (age >= 4 && age <= 12) {
            return "儿童";
        } else if (age >= 13 && age <= 17) {
            return "青少年";
        } else if (age >= 18 && age <= 44) {
            return "青年";
        } else if (age >= 45 && age <= 59) {
            return "中年";
        } else {
            return "老年";
        }
    }
}