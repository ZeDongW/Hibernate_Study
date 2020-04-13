package cn.zedongw.query;

import org.junit.Test;

public class QueryDemoTest {
    QueryDemo qd = new QueryDemo();
    @Test
    public void queryByHQL() {
        qd.queryByHQL();
    }

    @Test
    public void queryByQBC() {
        qd.queryByQBC();
    }

    @Test
    public void queryBySQL() {
        qd.queryBySQL();
    }

    @Test
    public void addBySQL() {
        qd.addBySQL("q12345");
    }
}