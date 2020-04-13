package cn.zedongw.mapping.o2o2;

import cn.zedongw.mapping.o2o2.entity.IdCard2;
import cn.zedongw.mapping.o2o2.entity.Person2;
import cn.zedongw.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @ClassName One2One
 * @Description: 一对一映射
 * @Author ZeDongW
 * @Date 2020/3/15 0015 21:45
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class One2One2 {

    public void save(){
        Session session = HibernateUtils.getSession(IdCard2.class, Person2.class);
        Transaction tx = session.beginTransaction();
        Person2 person = new Person2();
        person.setpName("Jack");
        IdCard2 idCard = new IdCard2();
        idCard.setPlace("湖北 武汉");
        idCard.setIid(420100);
        idCard.setPerson(person);
        session.save(idCard);
        tx.commit();
        session.close();
    }

    public void get(){
        Session session = HibernateUtils.getSession(IdCard2.class, Person2.class);
        Transaction tx = session.beginTransaction();
        IdCard2 idCard = session.get( IdCard2.class, 1);
        System.out.println(idCard.getPlace());
        System.out.println(idCard.getPerson());
        tx.commit();
        session.close();
    }
}
