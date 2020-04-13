package cn.zedongw.curd.impl;

import cn.zedongw.curd.IUsersDao;
import cn.zedongw.demo.entity.Users;
import cn.zedongw.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName UsersDaoImpl
 * @Description: 用户类数据访问层接口实现
 * @Author ZeDongW
 * @Date 2020/3/12 0012 11:56
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UsersDaoImpl implements IUsersDao {

    private Session session = null;
    private Transaction tx = null;

    /**
     * @param user
     * @MethodName: save
     * @Description: 新增用户
     * @Param: [user]
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:36
     */
    @Override
    public void save(Users user) {
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            session.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            session.close();
        }
    }

    /**
     * @param user
     * @MethodName: update
     * @Description: 更新用户
     * @Param: [user]
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:36
     */
    @Override
    public void update(Users user) {
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            session.update(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            session.close();
        }
    }

    /**
     * @param id
     * @MethodName: findById
     * @Description: 根据id查找用户
     * @Param: [id]
     * @Return: cn.zedongw.demo.entity.Users
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:36
     */
    @Override
    public Users findById(Serializable id) {
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            Users user = session.get(Users.class, id);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            session.close();
        }
        return null;
    }

    /**
     * @MethodName: getAll
     * @Description: 查找所有用户
     * @Param: []
     * @Return: java.util.List<cn.zedongw.demo.entity.Users>
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:52
     **/
    @Override
    public List<Users> getAll() {
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            Query query = session.createQuery("from Users");
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            session.close();
        }
        return null;
    }

    /**
     * @param userName
     * @MethodName: getAll
     * @Description: 根据用户名查找所有用户
     * @Param: [UsersName]
     * @Return: java.util.List<cn.zedongw.demo.entity.Users>
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:54
     */
    @Override
    public List<Users> getAll(String userName) {
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            Query query = session.createQuery("from Users where userName = ?0");
            return query.setParameter(0, userName).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            session.close();
        }
        return null;
    }

    /**
     * @param index
     * @param count
     * @MethodName: getAll
     * @Description: 分页查询
     * @Param: [index, count]
     * @Return: java.util.List<cn.zedongw.demo.entity.Users>
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:55
     */
    @Override
    public List<Users> getAll(int index, int count) {
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            Query query = session.createQuery("from Users");
            query.setFirstResult(index);
            query.setMaxResults(count);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            session.close();
        }
        return null;
    }

    /**
     * @param id
     * @MethodName: delete
     * @Description: 删除用户
     * @Param: [id]
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:55
     */
    @Override
    public void delete(Serializable id) {
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
           /* Users users = session.get(Users.class, id);
            if (users != null) {
                session.delete(users);
            }*/
           Users user = new Users();
            user.setId((Integer) id);
            session.delete(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            session.close();
        }

    }
}
