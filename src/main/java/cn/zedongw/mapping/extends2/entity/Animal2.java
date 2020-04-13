package cn.zedongw.mapping.extends2.entity;

/**
 * @ClassName Animal2
 * @Description: 动物实体类
 * @Author ZeDongW
 * @Date 2020/3/16 0016 13:35
 * @Version 2.0
 * @Modified By:
 * @Modified Time:
 **/
public class Animal2 {
    private int aid;
    private String aName;

    @Override
    public String toString() {
        return "Animal2{" +
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
