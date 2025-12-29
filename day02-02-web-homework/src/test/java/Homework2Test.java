import com.itheima.homework2.Manager;
import com.itheima.homework2.Programmer;

public class Homework2Test {
    public static void main(String[] args) {
        // 创建程序员对象并调用工作方法
        Programmer programmer = new Programmer("李飞", 100, 15000);
        programmer.work();
        // 创建项目经理对象并调用工作方法
        Manager manager = new Manager("张伟", 26, 30000, 5000);
        manager.work();
    }
}
