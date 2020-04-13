package cn.zedongw.mapping.extends4.entity;

/**
 * @ClassName Animal4
 * @Description: 动物实体类
 * @Author ZeDongW
 * @Date 2020/4/1 0001 18:06
 * @Version 3.0
 * @Modified By:
 * @Modified Time:
 **/
public class Animal4 {
    private String aid;
    private String aName;

    @Override
    public String toString() {
        return "Animal4{" +
                "aid=" + aid +
                ", aName='" + aName + '\'' +
                '}';
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }
}
