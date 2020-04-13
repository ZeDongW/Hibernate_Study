package cn.zedongw.mapping.component;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComponentTest {
    Component com = new Component();

    @Test
    public void save() {
        com.save();
    }

    @Test
    public void get() {
        com.get();
    }
}