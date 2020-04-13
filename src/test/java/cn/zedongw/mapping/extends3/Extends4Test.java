package cn.zedongw.mapping.extends3;

import org.junit.Test;

public class Extends4Test {
    Extends3 ex3 = new Extends3();
    @Test
    public void saveCat() {
        ex3.saveCat();
    }

    @Test
    public void saveMonkey() {
        ex3.saveMonkey();
    }

    @Test
    public void getCat() {
        ex3.getCat();
    }

    @Test
    public void getMonkey() {
        ex3.getMonkey();
    }
}