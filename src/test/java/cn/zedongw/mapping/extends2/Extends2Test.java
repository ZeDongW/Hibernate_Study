package cn.zedongw.mapping.extends2;

import org.junit.Test;

public class Extends2Test {
    Extends2 ex2 = new Extends2();
    @Test
    public void saveCat() {
        ex2.saveCat();
    }

    @Test
    public void saveMonkey() {
        ex2.saveMonkey();
    }

    @Test
    public void getCat() {
        ex2.getCat();
    }

    @Test
    public void getMonkey() {
        ex2.getMonkey();
    }
}