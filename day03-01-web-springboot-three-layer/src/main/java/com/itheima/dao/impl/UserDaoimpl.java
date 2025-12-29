package com.itheima.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.itheima.controller.UserController;
import com.itheima.dao.IUserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Repository// IOC注解，将当前组件加入到Spring容器中(内存中)
public class UserDaoimpl  implements IUserDao {
    @Override
    public List<String> getData() {
        InputStream in = UserController.class.getClassLoader().getResourceAsStream("user.txt");
        List<String> rows = IoUtil.readUtf8Lines(in, new ArrayList<String>());

        return rows;
    }
}