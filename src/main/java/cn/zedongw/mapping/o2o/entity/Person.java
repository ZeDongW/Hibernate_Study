package cn.zedongw.mapping.o2o.entity;

/**
 * @ClassName Person
 * @Description: 人实体类
 * @Author ZeDongW
 * @Date 2020/3/15 0015 21:45
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Person {
    private int pid;
    private String pName;
    private IdCard idCard;

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

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }
}
