package cn.zedongw.mapping.extends2.entity;

/**
 * @ClassName Cat2
 * @Description: 猫实体类
 * @Author ZeDongW
 * @Date 2020/3/16 0016 13:36
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Cat2 extends Animal2 {
    private String catchMouse;

    @Override
    public String toString() {
        return "Cat2{" +
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
