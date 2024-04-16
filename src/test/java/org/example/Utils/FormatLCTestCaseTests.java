package org.example.Utils;

import static org.junit.Assert.*;
import org.junit.Test;

public class FormatLCTestCaseTests {
    @Test
    public void generateTestCases() {
        String testCaseInput = """
                        ["MyHashMap","remove","put","remove","remove","get","remove","put","get","remove","put","put","put","put","put","put","put","put","put","put","put","remove","put","put","get","put","get","put","put","get","put","remove","remove","put","put","get","remove","put","put","put","get","put","put","remove","put","remove","remove","remove","put","remove","get","put","put","put","put","remove","put","get","put","put","get","put","remove","get","get","remove","put","put","put","put","put","put","get","get","remove","put","put","put","put","get","remove","put","put","put","put","put","put","put","put","put","put","remove","remove","get","remove","put","put","remove","get","put","put"]
                        [[],[27],[65,65],[19],[0],[18],[3],[42,0],[19],[42],[17,90],[31,76],[48,71],[5,50],[7,68],[73,74],[85,18],[74,95],[84,82],[59,29],[71,71],[42],[51,40],[33,76],[17],[89,95],[95],[30,31],[37,99],[51],[95,35],[65],[81],[61,46],[50,33],[59],[5],[75,89],[80,17],[35,94],[80],[19,68],[13,17],[70],[28,35],[99],[37],[13],[90,83],[41],[50],[29,98],[54,72],[6,8],[51,88],[13],[8,22],[85],[31,22],[60,9],[96],[6,35],[54],[15],[28],[51],[80,69],[58,92],[13,12],[91,56],[83,52],[8,48],[62],[54],[25],[36,4],[67,68],[83,36],[47,58],[82],[36],[30,85],[33,87],[42,18],[68,83],[50,53],[32,78],[48,90],[97,95],[13,8],[15,7],[5],[42],[20],[65],[57,9],[2,41],[6],[33],[16,44],[95,30]]
                        [null,null,null,null,null,-1,null,null,-1,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,90,null,-1,null,null,40,null,null,null,null,null,29,null,null,null,null,17,null,null,null,null,null,null,null,null,null,33,null,null,null,null,null,null,18,null,null,-1,null,null,-1,35,null,null,null,null,null,null,null,-1,-1,null,null,null,null,null,-1,null,null,null,null,null,null,null,null,null,null,null,null,null,-1,null,null,null,null,87,null,null] 
                        """;

        String expectedOutput = """
                MyHashMap myHashMap = new MyHashMap();
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
                """;

        String formattedTest = FormatLCTestCase.formatLCTestCase(testCaseInput);
        System.out.println(formattedTest);
        assertEquals(expectedOutput, formattedTest);
    }

}
