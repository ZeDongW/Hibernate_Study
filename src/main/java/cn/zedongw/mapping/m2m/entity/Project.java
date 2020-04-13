package cn.zedongw.mapping.m2m.entity;

import	java.util.HashSet;

import java.util.Set;

/**
 * @ClassName Project
 * @Description: 项目实体类
 * @Author ZeDongW
 * @Date 2020/3/13 0013 17:35
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Project {
    private int pid;
    private String pName;
    private Set<Developer> developers = new HashSet<Developer> ();

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Set<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Set<Developer> developers) {
        this.developers = developers;
    }

    @Override
    public String toString() {
        return "Project{" +
                "pid=" + pid +
                ", pName='" + pName + '\'' +
                ", developers=" + developers +
                '}';
    }
}
