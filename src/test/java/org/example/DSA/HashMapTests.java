package org.example.DSA;

import static org.junit.Assert.*;
import org.junit.Test;

public class HashMapTests {
    @Test
    public void leetcodeCase1() {
        HashMap myHashMap = new HashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        assertEquals(1, myHashMap.get(1));    // return 1, The map is now [[1,1], [2,2]]
        assertEquals(-1, myHashMap.get(3));    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        assertEquals(1, myHashMap.get(2));    // return 1, The map is now [[1,1], [2,1]]
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        assertEquals(-1, myHashMap.get(2));    // return -1 (i.e., not found), The map is now [[1,1]]
    }

    @Test
    public void leetcodeCase9(){
        HashMap myHashMap = new HashMap();
        myHashMap.remove(27);
        myHashMap.put(65,65);
        myHashMap.remove(19);
        myHashMap.remove(0);
        assertEquals(-1,myHashMap.get(18));
        myHashMap.remove(3);
        myHashMap.put(42,0);
        assertEquals(-1,myHashMap.get(19));
        myHashMap.remove(42);
        myHashMap.put(17,90);
        myHashMap.put(31,76);
        myHashMap.put(48,71);
        myHashMap.put(5,50);
        myHashMap.put(7,68);
        myHashMap.put(73,74);
        myHashMap.put(85,18);
        myHashMap.put(74,95);
        myHashMap.put(84,82);
        myHashMap.put(59,29);
        myHashMap.put(71,71);
        myHashMap.remove(42);
        myHashMap.put(51,40);
        myHashMap.put(33,76);
        assertEquals(90,myHashMap.get(17));
        myHashMap.put(89,95);
        assertEquals(-1,myHashMap.get(95));
        myHashMap.put(30,31);
        myHashMap.put(37,99);
        assertEquals(40,myHashMap.get(51));
        myHashMap.put(95,35);
        myHashMap.remove(65);
        myHashMap.remove(81);
        myHashMap.put(61,46);
        myHashMap.put(50,33);
        assertEquals(29,myHashMap.get(59));
        myHashMap.remove(5);
        myHashMap.put(75,89);
        myHashMap.put(80,17);
        myHashMap.put(35,94);
        assertEquals(17,myHashMap.get(80));
        myHashMap.put(19,68);
        myHashMap.put(13,17);
        myHashMap.remove(70);
        myHashMap.put(28,35);
        myHashMap.remove(99);
        myHashMap.remove(37);
        myHashMap.remove(13);
        myHashMap.put(90,83);
        myHashMap.remove(41);
        assertEquals(33,myHashMap.get(50));
        myHashMap.put(29,98);
        myHashMap.put(54,72);
        myHashMap.put(6,8);
        myHashMap.put(51,88);
        myHashMap.remove(13);
        myHashMap.put(8,22);
        assertEquals(18,myHashMap.get(85));
        myHashMap.put(31,22);
        myHashMap.put(60,9);
        assertEquals(-1,myHashMap.get(96));
        myHashMap.put(6,35);
        myHashMap.remove(54);
        assertEquals(-1,myHashMap.get(15));
        assertEquals(35,myHashMap.get(28));
        myHashMap.remove(51);
        myHashMap.put(80,69);
        myHashMap.put(58,92);
        myHashMap.put(13,12);
        myHashMap.put(91,56);
        myHashMap.put(83,52);
        myHashMap.put(8,48);
        assertEquals(-1,myHashMap.get(62));
        assertEquals(-1,myHashMap.get(54));
        myHashMap.remove(25);
        myHashMap.put(36,4);
        myHashMap.put(67,68);
        myHashMap.put(83,36);
        myHashMap.put(47,58);
        assertEquals(-1,myHashMap.get(82));
        myHashMap.remove(36);
        myHashMap.put(30,85);
        myHashMap.put(33,87);
        myHashMap.put(42,18);
        myHashMap.put(68,83);
        myHashMap.put(50,53);
        myHashMap.put(32,78);
        myHashMap.put(48,90);
        myHashMap.put(97,95);
        myHashMap.put(13,8);
        myHashMap.put(15,7);
        myHashMap.remove(5);
        myHashMap.remove(42);
        assertEquals(-1,myHashMap.get(20));
        myHashMap.remove(65);
        myHashMap.put(57,9);
        myHashMap.put(2,41);
        myHashMap.remove(6);
        assertEquals(87,myHashMap.get(33));
        myHashMap.put(16,44);
        myHashMap.put(95,30);
    }
}
