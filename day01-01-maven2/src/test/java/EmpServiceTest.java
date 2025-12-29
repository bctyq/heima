import com.itheima.EmpService;
import org.junit.jupiter.api.Test;

public class EmpServiceTest {
    @Test
    public void testidcard(){
        EmpService empService=new EmpService();
        boolean beijing = empService.isBeijing("450422200403123313");
        System.out.println("是否是北京的："+beijing);
    }
    @Test
    public void testAge(){
        //创建EmpService对象
        EmpService empService=new EmpService();
        //调用方法进行测试
        Integer age = empService.getAge("450422200403123313");
        System.out.println("年龄："+age);
    }
    @Test
    public void testGender(){
        EmpService empService=new EmpService();
        String gender = empService.getGender("450422200403123313");
        System.out.println("性别："+gender);
    }
    @Test
    public void testYear(){
        EmpService empService=new EmpService();
        String year = empService.getYear("450422200403123313");
        System.out.println("出生年份："+year);
    }
    @Test
    public void testMonth(){
        EmpService empService=new EmpService();
        String month = empService.getMonth("450422200403123313");
        System.out.println("出生月份："+month);
    }
}