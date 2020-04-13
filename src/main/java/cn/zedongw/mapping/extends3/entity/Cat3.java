package cn.zedongw.mapping.extends3.entity;

/**
 * @ClassName Cat3
 * @Description: 猫实体类
 * @Author ZeDongW
 * @Date 2020/4/1 0001 18:07
 * @Version 3.0
 * @Modified By:
 * @Modified Time:
 **/
public class Cat3 extends Animal3{
    private String catchMouse;

    @Override
    public String toString() {
        return "Cat3{" +
                "catchMouse='" + catchMouse + '\'' +
                '}';
    }

    public String getCatchMouse() {
        return catchMouse;
    }

    public void setCatchMouse(String catchMouse) {
        this.catchMouse = catchMouse;
    }
}
