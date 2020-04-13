package cn.zedongw.demo;


import cn.zedongw.demo.entity.Users;
import cn.zedongw.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @ClassName Demo
 * @Description: hibernate使用演示
 * @Author ZeDongW
 * @Date 2020/3/11 0011 14:13
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Demo {

    /** @MethodName: save
     * @Description: hibernate保存
     * @Param: [user]
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/11 0011 14:50
     **/
    public void save(Users user){

        //开启会话
        Session session = HibernateUtils.getSession(Users.class);
        //开启事务
        Transaction tx = session.beginTransaction();
        //保存
        session.save(user);
        //提交事务
        tx.commit();
        //关闭会话
        session.close();
    }

    /** @MethodName: get
     * @Description: 懒加载
     * @Param: []
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 18:02
     **/
    public void get(){
        //开启会话
        Session session = HibernateUtils.getSession(Users.class);
        //开启事务
        Transaction tx = session.beginTransaction();
        Users u2 = session.load(Users.class, 3);

        System.out.println(u2);

        u2.setUserName("1234");

        tx.commit();
        session.close();

        // 在这里使用
//        System.out.println(u2.getBirthday());
    }

}
