package org.example.ArraysAndHashing;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    // Originally tried to brute force by listing through the arrays twice but the time complexity was O(n^2) so I ended
    // up using a hashset for constant time operations
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsMap = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            if (numsMap.contains(nums[i]) ){
                return true;
            }

            numsMap.add(nums[i]);
        }

        return false;
    }

    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] resultSet = new int[2];

        for (int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];

            if (map.containsKey(compliment)){
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupings = new HashMap<>();

        for (String str : strs){
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);

            String sortedString = new String(strArray);

            if (!groupings.containsKey(sortedString)){
                groupings.put(sortedString, new ArrayList<>());
            }

            groupings.get(sortedString).add(str);
        }

        return new ArrayList<>(groupings.values());
    }

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> buckets = new TreeMap<>();

        for (int i : nums){
            buckets.merge(i, 1, Integer::sum);
        }

        List<Integer> resultList = buckets.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        int[] resultArray = new int[k];

        for (int i = 0; i < k; i++){
            resultArray[i] = resultList.get(resultList.size() - 1 - i);
        }

        return resultArray;
    }

    public int[] productExceptSelf(int[] nums) {
        // This isn't my solution, this is the top Leetcode solution in Java. However it's very clever and I wanted to
        // look at it with my debugger :)
        int len = nums.length;
        int[] result = new int[len];

        int leftProduct = 1;
        for (int i = 0; i < len; i++) {
            result[i] = leftProduct; // Store product of elements to the left
            leftProduct *= nums[i]; // Calculate product of elements to the left
        }

        int rightProduct = 1;
        for (int i = len - 1; i >= 0; i--) {
            result[i] *= rightProduct; // Multiply by product of elements to the right
            rightProduct *= nums[i]; // Calculate product of elements to the right
        }

        return result;
    }
}