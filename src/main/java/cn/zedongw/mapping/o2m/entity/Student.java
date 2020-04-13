package cn.zedongw.mapping.o2m.entity;

import java.util.Objects;

/**
 * @ClassName Student
 * @Description: 学生实体类
 * @Author ZeDongW
 * @Date 2020/3/13 0013 14:30
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Student {
    private int sid;
    private String sName;
    private Grade grade;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid == student.sid &&
                Objects.equals(sName, student.sName) &&
                Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sName, grade);
    }

    public Student() {
    }

    public Student(int sid, String sName, Grade grade) {
        this.sid = sid;
        this.sName = sName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sName=" + sName +
                ", grade=" + grade +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
