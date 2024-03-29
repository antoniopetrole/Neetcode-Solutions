package org.example.DSA;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DynamicArrayTests {

    @Test
    public void constructor(){
        DynamicArray dynamicArray = new DynamicArray(10);

        assertThrows(IllegalArgumentException.class, () -> {DynamicArray dynamicArrayInvalid = new DynamicArray(-2);});
    }

    @Test
    public void setOutOfBounds() {
        DynamicArray dynamicArray = new DynamicArray(10);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            dynamicArray.set(3, 256);
        });
    }

    @Test
    public void getOutOfBounds(){
        DynamicArray dynamicArray = new DynamicArray(10);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            dynamicArray.get(10);
        });
    }

    @Test
    public void pushBack(){
        DynamicArray dynamicArray = new DynamicArray(2);

        dynamicArray.pushback(10);
        dynamicArray.pushback(22);
        dynamicArray.pushback(362);
        dynamicArray.pushback(3493);

        assertEquals(10, dynamicArray.get(0));
        assertEquals(22, dynamicArray.get(1));
        assertEquals(362, dynamicArray.get(2));
        assertEquals(3493, dynamicArray.get(3));
        assertEquals(4, dynamicArray.getSize());
    }
   @Test
   public void getSizeAndCapacity(){
        DynamicArray dynamicArray = new DynamicArray(2);

        assertEquals(2, dynamicArray.getCapacity());
        assertEquals(0, dynamicArray.getSize());

        dynamicArray.pushback(10);
        dynamicArray.pushback(10);
        dynamicArray.pushback(10);

        assertEquals(4, dynamicArray.getCapacity());
        assertEquals(3, dynamicArray.getSize());
    }

    @Test
    public void popback(){
        DynamicArray dynamicArray = new DynamicArray(10);
        dynamicArray.pushback(10);
        dynamicArray.pushback(54);
        dynamicArray.pushback(354);

        assertEquals(354, dynamicArray.popback());
        assertEquals(54, dynamicArray.popback());
        assertEquals(10, dynamicArray.popback());
        assertThrows(IndexOutOfBoundsException.class, () -> {
            dynamicArray.popback();
        });
    }
    @Test
    public void neetcodeCase3(){
        // ["Array", 1, "getSize", "getCapacity", "pushback", 1, "getSize", "getCapacity", "pushback", 2, "getSize", "getCapacity", "get", 1, "set", 1, 3, "get", 1, "popback", "getSize", "getCapacity"]
        // Expected [null,0,1,null,1,1,null,2,2,2,null,3,3,1,2]

        // [1, 2]
        DynamicArray dynamicArray = new DynamicArray(1);
        assertEquals(0, dynamicArray.getSize());
        assertEquals(1, dynamicArray.getCapacity());
        dynamicArray.pushback(1);
        assertEquals(1, dynamicArray.getSize());
        assertEquals(1, dynamicArray.getCapacity());
        dynamicArray.pushback(2);
        assertEquals(2, dynamicArray.getSize());
        assertEquals(2, dynamicArray.getCapacity());
        assertEquals(2, dynamicArray.get(1));
        dynamicArray.set(1, 3);
        assertEquals(3, dynamicArray.get(1));
        assertEquals(3, dynamicArray.popback());
        assertEquals(1, dynamicArray.getSize());
        assertEquals(2, dynamicArray.getCapacity());
    }

}

