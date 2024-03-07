package com.learning.core.day3;
import java.util.*;

import java.util.Scanner;
public class D03P05 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array input from user
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get value of k from user
        System.out.println("Enter the desired size of combinations (k):");
        int k = scanner.nextInt();

        // Find all distinct combinations using backtracking
        List<List<Integer>> combinations = findCombinations(arr, k);

        // Print combinations
        if (combinations.isEmpty()) {
            System.out.println("No distinct combinations of size " + k + " found.");
        } else {
            System.out.println("All distinct combinations of size " + k + ":");
            for (List<Integer> combination : combinations) {
                System.out.println(combination);
            }
        }
    }

    public static List<List<Integer>> findCombinations(int[] arr, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>();
        List<Integer> current = new ArrayList<>();
        findCombinations(arr, k, 0, current, combinations, seen);
        return combinations;
    }

    private static void findCombinations(int[] arr, int k, int index, List<Integer> current,
                                         List<List<Integer>> combinations, Set<List<Integer>> seen) {
        if (current.size() == k) {
            // Add a copy of the current combination to avoid modification of original list
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);
            // Hash set ensures only unique combinations are added based on element order
            if (seen.add(current)) {
                findCombinations(arr, k, i + 1, current, combinations, seen);
            }
            current.remove(current.size() - 1);
            seen.remove(current);
        }
    }
}