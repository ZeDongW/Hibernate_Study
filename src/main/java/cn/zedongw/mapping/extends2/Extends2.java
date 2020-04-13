package cn.zedongw.mapping.extends2;

import cn.zedongw.mapping.extends2.entity.Animal2;
import cn.zedongw.mapping.extends2.entity.Cat2;
import cn.zedongw.mapping.extends2.entity.Monkey2;
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
public class Extends2 {

    public void saveCat(){
        Session session = HibernateUtils.getSession(Animal2.class);
        Transaction tx = session.beginTransaction();
        Cat2 cat = new Cat2();
        cat.setaName("大花猫");
        cat.setCatchMouse("抓老鼠");
        session.save(cat);
        tx.commit();
        session.close();
    }

    public void saveMonkey(){
        Session session = HibernateUtils.getSession(Animal2.class);
        Transaction tx = session.beginTransaction();
        Monkey2 monkey = new Monkey2();
        monkey.setaName("大马猴");
        monkey.setEatBanana("吃香蕉");
        session.save(monkey);
        tx.commit();
        session.close();
    }

    public void getCat(){
        Session session = HibernateUtils.getSession(Animal2.class);
        Transaction tx = session.beginTransaction();
        Cat2 cat = session.get(Cat2.class, 1);
        System.out.println(cat);
        tx.commit();
        session.close();
    }

    public void getMonkey(){
        Session session = HibernateUtils.getSession(Animal2.class);
        Transaction tx = session.beginTransaction();
        Monkey2 monkey = session.get(Monkey2.class, 1);
        System.out.println(monkey);
        tx.commit();
        session.close();
    }
}
