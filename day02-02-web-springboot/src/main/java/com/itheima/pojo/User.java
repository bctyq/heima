package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//1,daqiao,1234567890,大乔,22,2024-07-15 15:05:45
public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;
    private String updateTime;
}