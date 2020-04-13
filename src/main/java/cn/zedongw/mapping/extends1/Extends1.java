package cn.zedongw.mapping.extends1;

import cn.zedongw.mapping.extends1.entity.Cat1;
import cn.zedongw.mapping.extends1.entity.Monkey1;
import cn.zedongw.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @ClassName Extends1
 * @Description: 简单映射
 * @Author ZeDongW
 * @Date 2020/3/16 0016 13:38
 * @Version
 * @Modified By:
 * @Modified Time:
 **/
public class Extends1 {

    public void saveCat(){
        Session session = HibernateUtils.getSession(Cat1.class);
        Transaction tx = session.beginTransaction();
        Cat1 cat = new Cat1();
        cat.setaName("大花猫");
        cat.setCatchMouse("抓老鼠");
        session.save(cat);
        tx.commit();
        session.close();
    }

    public void saveMonkey(){
        Session session = HibernateUtils.getSession(Monkey1.class);
        Transaction tx = session.beginTransaction();
        Monkey1 monkey = new Monkey1();
        monkey.setaName("大马猴");
        monkey.setEatBanana("吃香蕉");
        session.save(monkey);
        tx.commit();
        session.close();
    }

    public void getCat(){
        Session session = HibernateUtils.getSession(Cat1.class);
        Transaction tx = session.beginTransaction();
        Cat1 cat = session.get(Cat1.class, 1);
        System.out.println(cat);
        tx.commit();
        session.close();
    }

    public void getMonkey(){
        Session session = HibernateUtils.getSession(Monkey1.class);
        Transaction tx = session.beginTransaction();
        Monkey1 monkey = session.get(Monkey1.class, 1);
        System.out.println(monkey);
        tx.commit();
        session.close();
    }
}
