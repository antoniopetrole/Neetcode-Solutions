package org.example.DSA;

import static org.junit.Assert.*;

import org.example.Utils.FormatLCTestCase;
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
    public void leetcodeCase9() {
        HashMap myHashMap = new HashMap();
        myHashMap.remove(27);
        myHashMap.put(65, 65);
        myHashMap.remove(19);
        myHashMap.remove(0);
        assertEquals(-1, myHashMap.get(18));
        myHashMap.remove(3);
        myHashMap.put(42, 0);
        assertEquals(-1, myHashMap.get(19));
        myHashMap.remove(42);
        myHashMap.put(17, 90);
        myHashMap.put(31, 76);
        myHashMap.put(48, 71);
        myHashMap.put(5, 50);
        myHashMap.put(7, 68);
        myHashMap.put(73, 74);
        myHashMap.put(85, 18);
        myHashMap.put(74, 95);
        myHashMap.put(84, 82);
        myHashMap.put(59, 29);
        myHashMap.put(71, 71);
        myHashMap.remove(42);
        myHashMap.put(51, 40);
        myHashMap.put(33, 76);
        assertEquals(90, myHashMap.get(17));
        myHashMap.put(89, 95);
        assertEquals(-1, myHashMap.get(95));
        myHashMap.put(30, 31);
        myHashMap.put(37, 99);
        assertEquals(40, myHashMap.get(51));
        myHashMap.put(95, 35);
        myHashMap.remove(65);
        myHashMap.remove(81);
        myHashMap.put(61, 46);
        myHashMap.put(50, 33);
        assertEquals(29, myHashMap.get(59));
        myHashMap.remove(5);
        myHashMap.put(75, 89);
        myHashMap.put(80, 17);
        myHashMap.put(35, 94);
        assertEquals(17, myHashMap.get(80));
        myHashMap.put(19, 68);
        myHashMap.put(13, 17);
        myHashMap.remove(70);
        myHashMap.put(28, 35);
        myHashMap.remove(99);
        myHashMap.remove(37);
        myHashMap.remove(13);
        myHashMap.put(90, 83);
        myHashMap.remove(41);
        assertEquals(33, myHashMap.get(50));
        myHashMap.put(29, 98);
        myHashMap.put(54, 72);
        myHashMap.put(6, 8);
        myHashMap.put(51, 88);
        myHashMap.remove(13);
        myHashMap.put(8, 22);
        assertEquals(18, myHashMap.get(85));
        myHashMap.put(31, 22);
        myHashMap.put(60, 9);
        assertEquals(-1, myHashMap.get(96));
        myHashMap.put(6, 35);
        myHashMap.remove(54);
        assertEquals(-1, myHashMap.get(15));
        assertEquals(35, myHashMap.get(28));
        myHashMap.remove(51);
        myHashMap.put(80, 69);
        myHashMap.put(58, 92);
        myHashMap.put(13, 12);
        myHashMap.put(91, 56);
        myHashMap.put(83, 52);
        myHashMap.put(8, 48);
        assertEquals(-1, myHashMap.get(62));
        assertEquals(-1, myHashMap.get(54));
        myHashMap.remove(25);
        myHashMap.put(36, 4);
        myHashMap.put(67, 68);
        myHashMap.put(83, 36);
        myHashMap.put(47, 58);
        assertEquals(-1, myHashMap.get(82));
        myHashMap.remove(36);
        myHashMap.put(30, 85);
        myHashMap.put(33, 87);
        myHashMap.put(42, 18);
        myHashMap.put(68, 83);
        myHashMap.put(50, 53);
        myHashMap.put(32, 78);
        myHashMap.put(48, 90);
        myHashMap.put(97, 95);
        myHashMap.put(13, 8);
        myHashMap.put(15, 7);
        myHashMap.remove(5);
        myHashMap.remove(42);
        assertEquals(-1, myHashMap.get(20));
        myHashMap.remove(65);
        myHashMap.put(57, 9);
        myHashMap.put(2, 41);
        myHashMap.remove(6);
        assertEquals(87, myHashMap.get(33));
        myHashMap.put(16, 44);
        myHashMap.put(95, 30);
    }

    @Test
    public void testCase21() {
        String input = """
                ["MyHashMap","put","put","put","put","remove","put","put","put","put","remove","put","put","put","put","put","put","put","put","get","put","put","put","put","put","put","put","put","remove","remove","put","put","get","put","put","get","get","get","put","get","get","put","remove","put","get","get","remove","put","put","put","get","put","get","put","put","put","get","put","remove","put","get","get","remove","put","put","remove","get","put","put","put","put","put","get","put","get","put","put","put","get","put","put","put","put","put","put","put","put","put","put","put","put","put","remove","get","put","put","put","put","put","get","remove"]
                [[],[54,35],[36,39],[63,9],[72,28],[78],[84,88],[56,42],[69,55],[4,47],[56],[24,46],[5,18],[35,94],[10,4],[50,67],[77,16],[75,48],[7,80],[65],[61,5],[52,32],[68,84],[54,18],[44,41],[17,60],[43,30],[30,49],[56],[54],[20,52],[4,0],[56],[98,51],[66,73],[23],[72],[83],[83,41],[13],[44],[91,93],[33],[16,53],[5],[77],[78],[80,40],[1,92],[93,35],[16],[86,60],[80],[94,91],[69,23],[4,72],[5],[53,15],[50],[82,14],[69],[35],[84],[82,44],[38,64],[4],[46],[20,16],[9,66],[15,64],[71,88],[82,11],[46],[37,29],[27],[80,78],[40,96],[21,60],[22],[12,1],[52,84],[44,56],[95,62],[16,67],[71,13],[93,17],[19,0],[61,13],[14,73],[29,46],[13,61],[2,12],[75],[60],[96,79],[45,88],[67,92],[86,75],[21,66],[91],[67]]
                [null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,-1,null,null,null,null,null,null,null,null,null,null,null,null,-1,null,null,-1,28,-1,null,-1,41,null,null,null,18,16,null,null,null,null,53,null,40,null,null,null,18,null,null,null,23,94,null,null,null,null,-1,null,null,null,null,null,-1,null,-1,null,null,null,-1,null,null,null,null,null,null,null,null,null,null,null,null,null,null,-1,null,null,null,null,null,93,null]
                """;

//        System.out.println(FormatLCTestCase.formatLCTestCase(input));
        HashMap myHashMap = new HashMap();
        myHashMap.put(54, 35);
        myHashMap.put(36, 39);
        myHashMap.put(63, 9);
        myHashMap.put(72, 28);
        myHashMap.remove(78);
        myHashMap.put(84, 88);
        myHashMap.put(56, 42);
        myHashMap.put(69, 55);
        myHashMap.put(4, 47);
        myHashMap.remove(56);
        myHashMap.put(24, 46);
        myHashMap.put(5, 18);
        myHashMap.put(35, 94);
        myHashMap.put(10, 4);
        myHashMap.put(50, 67);
        myHashMap.put(77, 16);
        myHashMap.put(75, 48);
        myHashMap.put(7, 80);
        assertEquals(-1, myHashMap.get(65));
        myHashMap.put(61, 5);
        myHashMap.put(52, 32);
        myHashMap.put(68, 84);
        myHashMap.put(54, 18);
        myHashMap.put(44, 41);
        myHashMap.put(17, 60);
        myHashMap.put(43, 30);
        myHashMap.put(30, 49);
        myHashMap.remove(56);
        myHashMap.remove(54);
        myHashMap.put(20, 52);
        myHashMap.put(4, 0);
        assertEquals(-1, myHashMap.get(56));
        myHashMap.put(98, 51);
        myHashMap.put(66, 73);
        assertEquals(-1, myHashMap.get(23));
        assertEquals(28, myHashMap.get(72));
        assertEquals(-1, myHashMap.get(83));
        myHashMap.put(83, 41);
        assertEquals(-1, myHashMap.get(13));
        assertEquals(41, myHashMap.get(44));
        myHashMap.put(91, 93);
        myHashMap.remove(33);
        myHashMap.put(16, 53);
        assertEquals(18, myHashMap.get(5));
        assertEquals(16, myHashMap.get(77));
        myHashMap.remove(78);
        myHashMap.put(80, 40);
        myHashMap.put(1, 92);
        myHashMap.put(93, 35);
        assertEquals(53, myHashMap.get(16));
        myHashMap.put(86, 60);
        assertEquals(40, myHashMap.get(80));
        myHashMap.put(94, 91);
        myHashMap.put(69, 23);
        myHashMap.put(4, 72);
        assertEquals(18, myHashMap.get(5));
        myHashMap.put(53, 15);
        myHashMap.remove(50);
        myHashMap.put(82, 14);
        assertEquals(23, myHashMap.get(69));
        assertEquals(94, myHashMap.get(35));
        myHashMap.remove(84);
        myHashMap.put(82, 44);
        myHashMap.put(38, 64);
        myHashMap.remove(4);
        assertEquals(-1, myHashMap.get(46));
        myHashMap.put(20, 16);
        myHashMap.put(9, 66);
        myHashMap.put(15, 64);
        myHashMap.put(71, 88);
        myHashMap.put(82, 11);
        assertEquals(-1, myHashMap.get(46));
        myHashMap.put(37, 29);
        assertEquals(-1, myHashMap.get(27));
        myHashMap.put(80, 78);
        myHashMap.put(40, 96);
        myHashMap.put(21, 60);
        assertEquals(-1, myHashMap.get(22));
        myHashMap.put(12, 1);
        myHashMap.put(52, 84);
        myHashMap.put(44, 56);
        myHashMap.put(95, 62);
        myHashMap.put(16, 67);
        myHashMap.put(71, 13);
        myHashMap.put(93, 17);
        myHashMap.put(19, 0);
        myHashMap.put(61, 13);
        myHashMap.put(14, 73);
        myHashMap.put(29, 46);
        myHashMap.put(13, 61);
        myHashMap.put(2, 12);
        myHashMap.remove(75);
        assertEquals(-1, myHashMap.get(60));
        myHashMap.put(96, 79);
        myHashMap.put(45, 88);
        myHashMap.put(67, 92);
        myHashMap.put(86, 75);
        myHashMap.put(21, 66);
        assertEquals(93, myHashMap.get(91));
        myHashMap.remove(67);
    }
};
