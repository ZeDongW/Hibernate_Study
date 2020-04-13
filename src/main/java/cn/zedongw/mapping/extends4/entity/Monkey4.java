package cn.zedongw.mapping.extends4.entity;

/**
 * @ClassName Monkey3
 * @Description: 猴子实体类
 * @Author ZeDongW
 * @Date 2020/4/1 0001 18:08
 * @Version 3.0
 * @Modified By:
 * @Modified Time:
 **/
public class Monkey4 extends Animal4 {
    private String eatBanana;

    @Override
    public String toString() {
        return "Monkey4{" +
                "eatBanana='" + eatBanana + '\'' +
                '}';
    }

    public String getEatBanana() {
        return eatBanana;
    }

    public void setEatBanana(String eatBanana) {
        this.eatBanana = eatBanana;
    }
}
