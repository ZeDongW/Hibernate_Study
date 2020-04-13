package cn.zedongw.mapping.component.entity;

/**
 * @ClassName Whell
 * @Description: 车轮实体类
 * @Author ZeDongW
 * @Date 2020/3/16 0016 8:59
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Whell {
    private int count;
    private int size;

    @Override
    public String toString() {
        return "Whell{" +
                "count=" + count +
                ", size=" + size +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
