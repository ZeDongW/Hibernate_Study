package cn.zedongw.mapping.extends3.entity;

/**
 * @ClassName Animal3
 * @Description: 动物实体类
 * @Author ZeDongW
 * @Date 2020/4/1 0001 18:06
 * @Version 3.0
 * @Modified By:
 * @Modified Time:
 **/
public class Animal3 {
    private int aid;
    private String aName;

    @Override
    public String toString() {
        return "Animal3{" +
                "aid=" + aid +
                ", aName='" + aName + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }
}
