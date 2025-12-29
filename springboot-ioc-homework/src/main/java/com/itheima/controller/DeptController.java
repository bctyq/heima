package com.itheima.controller;


import com.itheima.pojo.Dept;
import com.itheima.service.IDeptService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DeptController {
    @Resource(name = "deptServiceimpl")
    private IDeptService deptService;
    @RequestMapping("/depts")
    public List<Dept> list(){
//    public Result list2(){
        return deptService.getDeptList();
//        //1. 加载文件 ,  获取原始数据
//        InputStream in = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
//        List<String> lines = IoUtil.readUtf8Lines(in, new ArrayList<String>());
//
//        //2. 对原始数据进行处理 , 组装部门数据
//        List<Dept> deptList = lines.stream().map(line -> {
//            String[] parts = line.split(",");
//            Integer id = Integer.parseInt(parts[0]);
//            String name = parts[1];
//            LocalDateTime updateTime = LocalDateTime.parse(parts[2], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//            return new Dept(id, name, updateTime);
//        }).toList();
//
//        //2. 响应数据
//        return Result.success(deptList);
    }

}
