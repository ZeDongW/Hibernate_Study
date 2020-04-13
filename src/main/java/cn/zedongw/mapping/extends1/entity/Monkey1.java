package cn.zedongw.mapping.extends1.entity;

/**
 * @ClassName Monkey1
 * @Description: 猴子实体类
 * @Author ZeDongW
 * @Date 2020/3/16 0016 13:38
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Monkey1 extends Animal1 {
    private String eatBanana;

    public String getEatBanana() {
        return eatBanana;
    }

    public void setEatBanana(String eatBanana) {
        this.eatBanana = eatBanana;
    }

    @Override
    public String toString() {
        return "Monkey1{" +
                "eatBanana='" + eatBanana + '\'' +
                '}';
    }
}
