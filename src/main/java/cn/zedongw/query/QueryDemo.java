package cn.zedongw.query;

import cn.zedongw.demo.entity.Users;
import cn.zedongw.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * @ClassName QueryDemo
 * @Description: hibernate 3种查询方式
 * @Author ZeDongW
 * @Date 2020/3/12 0012 9:33
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class QueryDemo {
//    Logger logger = LogManager.getLogger(QueryDemo.class);
    /** @MethodName: queryByHQL
     * @Description: HQL查询
     * @Param: []
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 9:41
     **/
    public void queryByHQL(){
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            Query query = session.createQuery("from Users where id = 2");
//            logger.info("========={}==============",query.list());
            System.out.println(query.list());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            session.close();
        }
    }

    /** @MethodName: queryByQBC
     * @Description: QBC查询
     * @Param: []
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 10:11
     **/
    public void queryByQBC(){
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Users> criteria = cb.createQuery(Users.class);
            Root<Users> root = criteria.from(Users.class);
            criteria.select(root);
            criteria.where(cb.equal(root.get("id"),2));
            System.out.println(session.createQuery(criteria).list());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            session.close();
        }
    }

    /** @MethodName: queryBySQL
     * @Description: 通过本土化sql查询
     * @Param: []
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:08
     **/
    public void queryBySQL(){
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            Query query = session.createSQLQuery("select * from users where userName like '张三1%'").addEntity(Users.class);;
            System.out.println(query.list());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            session.close();
        }
    }

    /**
     * Description: 新增用户
     * @methodName: addBySQL
     * @param
     * @throws
     * @return: void
     * @author: ZeDongW
     * @date: 2020/4/13 0013 0:18
     */
    public void addBySQL(String userName){
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            Query query = session.createSQLQuery("insert into users(userName) values(MD5(?1))");
            query.setParameter(1, userName);
            query.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            session.close();
        }
    }
}
