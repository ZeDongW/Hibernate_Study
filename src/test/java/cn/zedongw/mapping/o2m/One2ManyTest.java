package cn.zedongw.mapping.o2m;

import org.junit.Test;

import static org.junit.Assert.*;

public class One2ManyTest {
    One2Many o2m = new One2Many();
    @Test
    public void saveOne() {
        o2m.saveOne();
    }

    @Test
    public void saveMany() {
        o2m.saveMany();
    }

    @Test
    public void get() {
        o2m.get();
    }
}