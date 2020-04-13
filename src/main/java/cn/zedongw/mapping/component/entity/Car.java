package cn.zedongw.mapping.component.entity;

/**
 * @ClassName Car
 * @Description: 汽车实体类
 * @Author ZeDongW
 * @Date 2020/3/16 0016 8:59
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Car {
    private int cid;
    private String cName;
    private Whell whell;

    @Override
    public String toString() {
        return "Car{" +
                "cid=" + cid +
                ", cName='" + cName + '\'' +
                ", whell=" + whell +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Whell getWhell() {
        return whell;
    }

    public void setWhell(Whell whell) {
        this.whell = whell;
    }
}
