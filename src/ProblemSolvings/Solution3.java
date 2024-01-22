package ProblemSolvings;

import java.util.HashMap;

public class Solution3 { //{9, 7, 5, 3};
    public static int countPairs(int[] arr, int k) {
        // Initialize a HashMap to store the remainder frequencies
        HashMap<Integer, Integer> remainderMap = new HashMap<>();

        // Count the remainders and store in the HashMap
        for (int num : arr) {
            int remainder = (num % k + k) % k; // Handle negative remainders
            remainderMap.put(remainder, remainderMap.getOrDefault(remainder, 0) + 1);
        }

        // Count the pairs with sum divisible by k
        int count = 0;
        for (int num : arr) {
            int remainder = (num % k + k) % k;
            int complement = (k - remainder) % k;

            // If the complement exists in the remainderMap, add its frequency to the count
            if (remainderMap.containsKey(complement)) {
                count += remainderMap.get(complement);
            }

            // If num is its own complement, decrement the count
            if (remainder == complement) {
                count--;
            }
        }

        // Each pair is counted twice, so divide the count by 2
        return count / 2;
    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3};
        int k = 6;

        int result = countPairs(arr, k);
        System.out.println("Number of pairs with sum divisible by " + k + ": " + result);
    }
}
