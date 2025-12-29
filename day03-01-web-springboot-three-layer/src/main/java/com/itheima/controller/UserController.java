package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.IUserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
//@RestController = @Controller + @ResponseBody
//   控制器的类上必须使用 @Controller，除了创建对象并加入spring容器外，这个注解还可以标签当前类可以处理请求，所以不可以使用其他IOC注解替换
//   @ResponseBody 用于设置控制器类中方法的返回值作为响应体直接输出给前端，并且返回是对象或集合会自动转换为json字符串给到前端
//   json字符串格式与javascript对象格式非常像。
//   js对象格式：用于前端开发的js代码
//      普通对象格式：{key1:value1,key2:value2,...}  例如：let person = {name:"张三",age:20}
//      数组格式：[{key1:value1,key2:value2,...},{key1:value1,key2:value2,...}]  例如：let persons = [{name:"张三",age:20},{name:"李四",age:22}]
//   json字符串格式（javascript 对象标记）：常用于数据通信传输交换
//      '{"key1":value1,"key2":value2,...}'  例如：let personStr = '{"name":"张三","age":20}'
//      '[{"key1":value1,"key2":value2,...},{"key1":value1,"key2":value2,...}]'  例如：let personsStr = '[{"name":"张三","age":20},{"name":"李四",age:22}]'
public class UserController {
//private IUserService userService=new UserServiceimpl();
//    @Qualifier("userServiceimpl2")
//    @Autowired
    @Resource(name = "userServiceimpl3")
    private IUserService userService;
    @RequestMapping("/list")
    public List<User> list() {
        return userService.getUserList();
    }
}