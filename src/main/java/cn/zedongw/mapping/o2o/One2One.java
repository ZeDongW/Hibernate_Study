package cn.zedongw.mapping.o2o;

import cn.zedongw.mapping.o2o.entity.IdCard;
import cn.zedongw.mapping.o2o.entity.Person;
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
public class One2One {

    public void save(){
        Session session = HibernateUtils.getSession(IdCard.class, Person.class);
        Transaction tx = session.beginTransaction();
        Person person = new Person();
        person.setpName("Jack");
        IdCard idCard = new IdCard();
        idCard.setPlace("湖北 武汉");
        idCard.setPerson(person);
        session.save(idCard);
        tx.commit();
        session.close();
    }

    public void get(){
        Session session = HibernateUtils.getSession(IdCard.class, Person.class);
        Transaction tx = session.beginTransaction();
        IdCard idCard = session.get( IdCard.class, 1);
        System.out.println(idCard.getPlace());
        System.out.println(idCard.getPerson().getpName());
        tx.commit();
        session.close();
    }
}
