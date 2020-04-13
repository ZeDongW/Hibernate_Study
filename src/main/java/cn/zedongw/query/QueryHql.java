package cn.zedongw.query;

import cn.zedongw.demo.entity.Users;
import cn.zedongw.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * @ClassName QueryHql
 * @Description: Hibernate--HQL查询
 * @Author ZeDongW
 * @Date 2020/4/10 0010 18:31
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class QueryHql {

    public void all(){
        Session session = HibernateUtils.getSession(Users.class);
        Transaction tx = session.beginTransaction();
//        Users user = session.get(Users.class, 1);
//        Users user = session.load(Users.class, 1);
//        System.out.println(user);
//        Query query = session.createQuery("from Users");
//        Query query = session.createQuery("select u from Users u");
//        Query query = session.createQuery("select u.userName,u.id from Users u");
//        Query query = session.createQuery("select new Users(u.id,u.userName) from Users u");
        Query query = session.createQuery("from Users where id = ?1");
        query.setParameter(1,1);
        System.out.println(query.list());
        tx.commit();
        session.close();
    }
}
