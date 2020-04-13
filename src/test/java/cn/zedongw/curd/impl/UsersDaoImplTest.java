package cn.zedongw.curd.impl;

import cn.zedongw.curd.IUsersDao;
import cn.zedongw.demo.entity.Users;
import org.junit.Test;

import java.util.Date;

public class UsersDaoImplTest {
    IUsersDao dao = new UsersDaoImpl();

    @Test
    public void save() {
        Users user = new Users();
        user.setUserName("张三");
        user.setBirthday(new Date());
        dao.save(user);
    }

    @Test
    public void update() {
        Users user = new Users();
        user.setId(2);
        user.setUserName("张三");
        user.setBirthday(new Date());
        dao.update(user);
    }

    @Test
    public void findById() {
        System.out.println(dao.findById(2));
    }

    @Test
    public void getAll() {
        System.out.println(dao.getAll());
    }

    @Test
    public void testGetAll() {
        System.out.println(dao.getAll("张三3"));
    }

    @Test
    public void testGetAll1() {
        System.out.println(dao.getAll(3,2));
    }

    @Test
    public void delete() {
        dao.delete(3);
    }
}