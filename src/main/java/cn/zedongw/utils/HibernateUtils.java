package cn.zedongw.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @ClassName HibernateUtils
 * @Description: hibernate连接工具
 * @Author ZeDongW
 * @Date 2020/3/12 0012 9:24
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class HibernateUtils {
    public static Session getSession(Class... clazzs){
        Configuration cf = new Configuration();
        for (int i = 0; i < clazzs.length; i++) {
            cf.addClass(clazzs[i]);
        }

        SessionFactory sf = cf.configure().buildSessionFactory();
        Session session = sf.openSession();
        return session;
    }
}
