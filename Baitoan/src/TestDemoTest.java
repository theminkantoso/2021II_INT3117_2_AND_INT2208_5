import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDemoTest {
    int x = 72;
    int y = 1000000000;
    int z = 4420000;
    TestDemo a = new TestDemo(x, y, z);
    @Test
    void hello() {

        assertEquals("Tro cap hang thang: 22100000 Thoi gian huong tro cap: 6", a.execute());
        //assertEquals(1, TestDemo.eating(false));
    }
}