package cn.zedongw.mapping.component;

import cn.zedongw.mapping.component.entity.Car;
import cn.zedongw.mapping.component.entity.Whell;
import cn.zedongw.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @ClassName Component
 * @Description: 组件映射
 * @Author ZeDongW
 * @Date 2020/3/16 0016 9:03
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Component {
    public void save(){
        Session session = HibernateUtils.getSession(Car.class);
        Transaction tx = session.beginTransaction();
        Whell whell = new Whell();
        whell.setCount(4);
        whell.setSize(3);
        Car car = new Car();
        car.setcName("BWM");
        car.setWhell(whell);
        session.save(car);
        tx.commit();
        session.close();
    }

    public void get(){
        Session session = HibernateUtils.getSession(Car.class);
        Transaction tx = session.beginTransaction();
        Car car = session.get(Car.class, 1);
        System.out.println(car);
        tx.commit();
        session.close();
    }
}
