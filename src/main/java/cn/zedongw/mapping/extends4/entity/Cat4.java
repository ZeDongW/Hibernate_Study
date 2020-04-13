package cn.zedongw.mapping.extends4.entity;

/**
 * @ClassName Cat3
 * @Description: 猫实体类
 * @Author ZeDongW
 * @Date 2020/4/1 0001 18:07
 * @Version 3.0
 * @Modified By:
 * @Modified Time:
 **/
public class Cat4 extends Animal4 {
    private String catchMouse;

    @Override
    public String toString() {
        return "Cat4{" +
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
