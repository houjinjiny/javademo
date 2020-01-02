import com.itdr.controller.UsersController;
import com.itdr.pojo.Users;
import org.junit.Test;

import java.util.List;

public class TestDemo {
    @Test
    public void test1() throws Exception{

    }
    @Test
    public void test2() throws Exception{
        UsersController uc=new UsersController();
        List<Users> all = uc.getAll();
        for (Users users : all) {
            System.out.println(users);
        }


    }
}
