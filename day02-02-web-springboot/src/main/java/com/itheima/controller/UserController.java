package com.itheima.controller;

import cn.hutool.core.io.IoUtil;
import com.itheima.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {
    @RequestMapping("/userList")
    public List<String> userList() {
        InputStream in = UserController.class.getClassLoader().getResourceAsStream("user.txt");
        List<String> rows = IoUtil.readUtf8Lines(in, new ArrayList<String>());
        return rows;
    }
    @RequestMapping("/list")
    public List<User> list() {
        InputStream in = UserController.class.getClassLoader().getResourceAsStream("user.txt");
        List<String> rows = IoUtil.readUtf8Lines(in, new ArrayList<String>());
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < rows.size(); i++) {
            String row = rows.get(i);
            String[] splits = row.split(",");
            User user = new User();
            user.setId(Integer.valueOf(splits[0]));
            user.setUsername(splits[1]);
            user.setPassword(splits[2]);
            user.setName(splits[3]);
            user.setAge(Integer.valueOf(splits[4]));
            user.setUpdateTime(splits[5]);
            userList.add(user);
        }
        return userList;
    }
}