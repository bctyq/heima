package com.itheima.service.impl;

import com.itheima.dao.ILogDao;
import com.itheima.pojo.Log;
import com.itheima.pojo.Result;
import com.itheima.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceimpl implements ILogService {
    @Autowired
    private ILogDao logDao;
    @Override
    public Result getLoglist() {
        List<String> lines = logDao.getData();
        List<Log> logList = lines.stream().map(line -> {
            String[] parts = line.split(",");
            return new Log(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
        }).toList();
        return Result.success(logList);
    }
}
