package cn.zedongw.mapping.extends1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Extends1Test {
    Extends1 ex1 = new Extends1();
    @Test
    public void saveCat() {
        ex1.saveCat();
    }

    @Test
    public void saveMonkey() {
        ex1.saveMonkey();
    }

    @Test
    public void getCat() {
        ex1.getCat();
    }

    @Test
    public void getMonkey() {
        ex1.getMonkey();
    }
}