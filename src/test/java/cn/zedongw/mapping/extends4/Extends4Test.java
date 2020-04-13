package cn.zedongw.mapping.extends4;

import org.junit.Test;

import static org.junit.Assert.*;

public class Extends4Test {
    Extends4 ext4 = new Extends4();
    @Test
    public void saveCat() {
        ext4.saveCat();
    }

    @Test
    public void saveMonkey() {
        ext4.saveMonkey();
    }

    @Test
    public void getCat() {
        ext4.getCat();
    }

    @Test
    public void getMonkey() {
        ext4.getMonkey();
    }
}