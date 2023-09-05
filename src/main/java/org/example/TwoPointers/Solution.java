package org.example.TwoPointers;

import java.util.Arrays;

class Solution {
    public boolean isPalindrome(String s) {
        String cleanedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        StringBuffer stringBuffer = new StringBuffer(cleanedString);

        return (cleanedString.equals(stringBuffer.reverse().toString()) ? true : false);
    }
}