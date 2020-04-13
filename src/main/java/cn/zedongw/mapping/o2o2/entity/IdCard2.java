package cn.zedongw.mapping.o2o2.entity;

/**
 * @ClassName IdCard
 * @Description: 身份证实体类
 * @Author ZeDongW
 * @Date 2020/3/15 0015 21:47
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class IdCard2 {
    private int pid;
    private int iid;
    private String place;
    private Person2 person;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Person2 getPerson() {
        return person;
    }

    public void setPerson(Person2 person) {
        this.person = person;
    }
}
