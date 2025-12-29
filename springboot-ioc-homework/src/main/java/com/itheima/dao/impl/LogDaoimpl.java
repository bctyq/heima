package com.itheima.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.itheima.dao.ILogDao;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LogDaoimpl implements ILogDao {


    @Override
    public List<String> getData() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("log.txt");
        return IoUtil.readUtf8Lines(inputStream, new ArrayList<String>());
    }
}
