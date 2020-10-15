import com.App;
import com.beans.MyUser;
import com.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class Test1 {

    @Autowired
    private UserMapper userMapper;

   // @Autowired
   // private IUserService userService;

    @Test
    public void test1(){
//        List<MyUser> list = userMapper.selectList(null);
////        System.out.println(list);

        System.out.println("ok");
    }

    @Test
    public void test2(){

    }

    @Test
    public void save() {
        MyUser user = new MyUser();
        user.setUserpwd("123");
        user.setUsername("abc");
        userMapper.insert(user);
    }
    @Test
    public void update() {
        MyUser user = new MyUser();
        user.setId(2);
        user.setUserpwd("1234567");
        user.setUsername("abc");
        userMapper.updateById(user);
    }

    @Autowired
    private MyUser u;

    @Test
    public void testMyUser() {
        System.out.println(u);
    }


}
