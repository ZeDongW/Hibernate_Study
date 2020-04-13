package cn.zedongw.mapping.o2o2;

import org.junit.Test;

public class One2One2Test {
    One2One2 o2o2 = new One2One2();
    @Test
    public void save() {
        o2o2.save();
    }

    @Test
    public void get() {
      o2o2.get();
    }
}