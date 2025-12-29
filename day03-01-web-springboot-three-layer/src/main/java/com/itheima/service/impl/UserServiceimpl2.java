package com.itheima.service.impl;

import com.itheima.dao.IUserDao;
import com.itheima.pojo.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service//Ioc注解，将当前组件加入到Spring容器中(内存中)
public class UserServiceimpl2 implements IUserService {
//    private IUserDao userDao=new UserDaoimpl();
    @Autowired //DI注解（依赖注入），
    private IUserDao userDao;

    @Override
    public List<User> getUserList() {
        List<String> rows = userDao.getData();
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
