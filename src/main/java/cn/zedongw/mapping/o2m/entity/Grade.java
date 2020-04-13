package cn.zedongw.mapping.o2m.entity;

import	java.util.HashSet;

import java.util.Set;

/**
 * @ClassName Grade
 * @Description: 班级实体类
 * @Author ZeDongW
 * @Date 2020/3/13 0013 14:47
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Grade {
    private int gid;
    private String gName;
    private Set<Student> students = new HashSet<Student> ();

    public Grade() {
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gid=" + gid +
                ", gName='" + gName + '\'' +
                ", students=" + students +
                '}';
    }
}
