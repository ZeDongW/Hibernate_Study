package cn.zedongw.mapping.o2o.entity;

/**
 * @ClassName IdCard
 * @Description: 身份证实体类
 * @Author ZeDongW
 * @Date 2020/3/15 0015 21:47
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class IdCard {
    private int iid;
    private String place;
    private Person person;

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
