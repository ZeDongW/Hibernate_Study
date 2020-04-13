package cn.zedongw.mapping.m2m;

import cn.zedongw.mapping.m2m.entity.Developer;
import cn.zedongw.mapping.m2m.entity.Project;
import cn.zedongw.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @ClassName Many2Many
 * @Description: 多对多关系映射
 * @Author ZeDongW
 * @Date 2020/3/13 0013 18:00
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Many2Many {

    public void save(){
        Session session = HibernateUtils.getSession(Developer.class, Project.class);
        Transaction tx = session.beginTransaction();
        Project prj1 = new Project();
        prj1.setpName("OA");
        Project prj2 = new Project();
        prj2.setpName("电商");
        Developer dev1 = new Developer();
        dev1.setdName("老张");
        Developer dev2 = new Developer();
        dev2.setdName("老刘");
        Developer dev3 = new Developer();
        dev3.setdName("小王");
        dev1.getProjects().add(prj1);
        dev2.getProjects().add(prj1);
        dev2.getProjects().add(prj2);
        dev3.getProjects().add(prj2);
        session.save(prj1);
        session.save(prj2);
        session.save(dev1);
        session.save(dev2);
        session.save(dev3);
        tx.commit();
        session.close();
    }

    public void get(){
        Session session = HibernateUtils.getSession(Developer.class, Project.class);
        Transaction tx = session.beginTransaction();
        Project prj = session.get(Project.class, 1);
        System.out.println(prj.getpName());
        System.out.println(prj.getDevelopers());
        tx.commit();
        session.close();
    }

}
