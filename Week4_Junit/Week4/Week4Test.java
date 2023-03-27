import org.junit.Test;

import static org.junit.Assert.assertEquals.*;

public class Week4Test {
    Week4 test = new Week4();

    @Test
    public void testMax2Int1() {
        assertEquals(test.max2Int(5, 20), 20);
    }

    @Test
    public void testMax2Int2() {
        assertEquals(test.max2Int(2, 1), 2);
    }

    @Test
    public void testMax2Int3() {
        assertEquals(test.max2Int(84, 32), 84);
    }

    @Test
    public void testMax2Int4() {
        assertEquals(test.max2Int(66, 6), 66);
    }

    @Test
    public void testMax2Int5() {
        assertEquals(test.max2Int(12, 100), 100);
    }

    @Test
    public void testMinArray1() {
        int[] a = {1, 2, 3, 4, 5};
        assertEquals(test.minArray(a), 1);
    }

    @Test
    public void testMinArray2() {
        int[] a = {11, 22, 33, 44, 55};
        assertEquals(test.minArray(a), 11);
    }

    @Test
    public void testMinArray3() {
        int[] a = {0, 28, 7, 56, 99};
        assertEquals(test.minArray(a), 0);
    }

    @Test
    public void testMinArray4() {
        int[] a = {-1, -2, -3, -4, -5};
        assertEquals(test.minArray(a), -5);
    }

    @Test
    public void testMinArray5() {
        int[] a = {12, -52, 3, -4, 85};
        assertEquals(test.minArray(a), -52);
    }

    String[] str = {"Thiếu cân", "Bình thường", "Thừa cân", "Béo phì"};

    @Test
    public void testCalculateBMI1() {
        assertEquals(test.calculateBMI(60, 1.7), str[1]);
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals(test.calculateBMI(70, 1.65), str[3]);
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals(test.calculateBMI(70, 1.7), str[2]);
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals(test.calculateBMI(80, 1.89), str[1]);
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals(test.calculateBMI(40, 1.5), str[0]);
    }
}