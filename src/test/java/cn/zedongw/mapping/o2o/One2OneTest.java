package cn.zedongw.mapping.o2o;

import org.junit.Test;

import static org.junit.Assert.*;

public class One2OneTest {
    One2One o2o = new One2One();
    @Test
    public void save() {
        o2o.save();
    }

    @Test
    public void get() {
        o2o.get();
    }
}