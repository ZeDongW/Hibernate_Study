package cn.zedongw.mapping.o2m;

import cn.zedongw.mapping.o2m.entity.Grade;
import cn.zedongw.mapping.o2m.entity.Student;
import cn.zedongw.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @ClassName One2Many
 * @Description: 一对多关系维护
 * @Author ZeDongW
 * @Date 2020/3/13 0013 14:29
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class One2Many {

    /** @MethodName: saveOne
     * @Description: 保存单一方
     * @Param: []
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/13 0013 14:59
     **/
    public void saveOne(){
        Session session = HibernateUtils.getSession(Grade.class, Student.class);
        Transaction tx = session.beginTransaction();
        Grade grade = new Grade();
        grade.setgName("JAVA");
        Student st1 = new Student();
        st1.setsName("王五");
        Student st2 = new Student();
        st2.setsName("赵六");
        grade.getStudents().add(st1);
        grade.getStudents().add(st2);
//        session.save(st1);
//        session.save(st2);
        session.save(grade);
        tx.commit();
        session.close();
    }

    /** @MethodName: saveMany
     * @Description: 保存多方
     * @Param: []
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/13 0013 17:04
     **/
    public void saveMany(){
        Session session = HibernateUtils.getSession(Grade.class, Student.class);
        Transaction tx = session.beginTransaction();
        Grade grade = new Grade();
        grade.setgName("C#");
        Student st1 = new Student();
        st1.setsName("rose");
        st1.setGrade(grade);
        Student st2 = new Student();
        st2.setsName("jen");
        st2.setGrade(grade);
//        grade.getStudents().add(st1);
//        grade.getStudents().add(st2);

        session.save(grade);
        session.save(st1);
        session.save(st2);
        tx.commit();
        session.close();
    }

    /** @MethodName: get
     * @Description: 获取
     * @Param: []
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/13 0013 17:13
     **/
    public void get(){
        Session session = HibernateUtils.getSession(Grade.class, Student.class);
        Transaction tx = session.beginTransaction();
        Grade grade = session.get(Grade.class, 1);
        System.out.println(grade.getgName());
//        System.out.println(grade.getStudents());

        tx.commit();
        session.close();
    }
}
