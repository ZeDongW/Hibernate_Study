package cn.zedongw.mapping.extends3;

import cn.zedongw.mapping.extends3.entity.Animal3;
import cn.zedongw.mapping.extends3.entity.Cat3;
import cn.zedongw.mapping.extends3.entity.Monkey3;
import cn.zedongw.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @ClassName Extends3
 * @Description: 继承映射
 * @Author ZeDongW
 * @Date 3030/4/1 0001 18:48
 * @Version 3.0
 * @Modified By:
 * @Modified Time:
 **/
public class Extends3 {
    public void saveCat(){
        Session session = HibernateUtils.getSession(Animal3.class);
        Transaction tx = session.beginTransaction();
        Cat3 cat = new Cat3();
        cat.setaName("大花猫");
        cat.setCatchMouse("抓老鼠");
        session.save(cat);
        tx.commit();
        session.close();
    }

    public void saveMonkey(){
        Session session = HibernateUtils.getSession(Animal3.class);
        Transaction tx = session.beginTransaction();
        Monkey3 monkey = new Monkey3();
        monkey.setaName("大马猴");
        monkey.setEatBanana("吃香蕉");
        session.save(monkey);
        tx.commit();
        session.close();
    }

    public void getCat(){
        Session session = HibernateUtils.getSession(Animal3.class);
        Transaction tx = session.beginTransaction();
        Cat3 cat = session.get(Cat3.class, 1);
        System.out.println(cat);
        tx.commit();
        session.close();
    }

    public void getMonkey(){
        Session session = HibernateUtils.getSession(Animal3.class);
        Transaction tx = session.beginTransaction();
        Monkey3 monkey = session.get(Monkey3.class, 3);
        System.out.println(monkey);
        tx.commit();
        session.close();
    }
}
