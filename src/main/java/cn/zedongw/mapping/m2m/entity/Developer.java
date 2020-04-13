package cn.zedongw.mapping.m2m.entity;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @ClassName Developer
 * @Description: 开发人员实体类
 * @Author ZeDongW
 * @Date 2020/3/13 0013 17:36
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Developer {
    private int did;
    private String dName;
    private Set<Project> projects = new HashSet<Project> ();

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Developer developer = (Developer) o;
        return did == developer.did &&
                Objects.equals(dName, developer.dName) &&
                Objects.equals(projects, developer.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(did, dName, projects);
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
