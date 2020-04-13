package cn.zedongw.demo;

import cn.zedongw.demo.entity.Users;
import org.junit.Test;

import java.util.Date;

public class DemoTest {

    @Test
    public void save() {
        Users user = new Users();
        user.setUserName("张三1");
        user.setBirthday(new Date());
        new Demo().save(user);
    }

    @Test
    public void get() {
        new Demo().get();
    }
}