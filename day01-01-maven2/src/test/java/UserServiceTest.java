import com.itheima.UserService;
import org.junit.jupiter.api.Test;

public class UserServiceTest {
    @Test
    public void testGetAge(){
        //先创建UserService对象
        UserService userService = new UserService();
        //调用方法进行测试
        Integer age = userService.getAge("123456200012125678");
        System.out.println("测试年龄："+age);
    }
    @Test
    public void testGetGender(){
        //先创建UserService对象
        UserService userService = new UserService();
        //调用方法进行测试
        String gender = userService.getGender("123456200012125678");
        System.out.println("测试性别："+gender);
    }
}