package cn.zedongw.mapping.extends4;

import cn.zedongw.mapping.extends4.entity.Animal4;
import cn.zedongw.mapping.extends4.entity.Cat4;
import cn.zedongw.mapping.extends4.entity.Monkey4;
import cn.zedongw.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @ClassName Extends4
 * @Description: 继承映射
 * @Author ZeDongW
 * @Date 3030/4/1 0001 18:48
 * @Version 3.0
 * @Modified By:
 * @Modified Time:
 **/
public class Extends4 {
    public void saveCat(){
        Session session = HibernateUtils.getSession(Animal4.class);
        Transaction tx = session.beginTransaction();
        Cat4 cat = new Cat4();
        cat.setaName("大花猫");
        cat.setCatchMouse("抓老鼠");
        session.save(cat);
        tx.commit();
        session.close();
    }

    public void saveMonkey(){
        Session session = HibernateUtils.getSession(Animal4.class);
        Transaction tx = session.beginTransaction();
        Monkey4 monkey = new Monkey4();
        monkey.setaName("大马猴");
        monkey.setEatBanana("吃香蕉");
        session.save(monkey);
        tx.commit();
        session.close();
    }

    public void getCat(){
        Session session = HibernateUtils.getSession(Animal4.class);
        Transaction tx = session.beginTransaction();
        Cat4 cat = session.get(Cat4.class, "8280837771634fb70171634fb9d80000");
        System.out.println(cat);
        tx.commit();
        session.close();
    }

    public void getMonkey(){
        Session session = HibernateUtils.getSession(Animal4.class);
        Transaction tx = session.beginTransaction();
        Monkey4 monkey = session.get(Monkey4.class, "828083777163504b017163504d8b0000");
        System.out.println(monkey);
        tx.commit();
        session.close();
    }
}
