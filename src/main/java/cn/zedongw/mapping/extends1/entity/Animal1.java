package cn.zedongw.mapping.extends1.entity;

/**
 * @ClassName Animal1
 * @Description: 动物实体类
 * @Author ZeDongW
 * @Date 2020/3/16 0016 13:35
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Animal1 {
    private int aid;
    private String aName;

    @Override
    public String toString() {
        return "Animal1{" +
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
