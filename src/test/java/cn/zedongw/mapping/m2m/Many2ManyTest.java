package cn.zedongw.mapping.m2m;

import org.junit.Test;

import static org.junit.Assert.*;

public class Many2ManyTest {
    Many2Many m2m = new Many2Many();
    @Test
    public void save() {
        m2m.save();
    }

    @Test
    public void get() {
        m2m.get();
    }
}