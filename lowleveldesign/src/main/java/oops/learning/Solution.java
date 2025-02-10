package oops.learning;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        // Map to store the color assigned to each ball
        Map<Integer, Integer> ballColors = new HashMap<>();

        // Map to store the count of balls for each color
        Map<Integer, Integer> colorCount = new HashMap<>();

        int n = queries.length;  // Total number of queries
        int[] result = new int[n];  // Array to store the results

        // Process each query
        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];  // The ball number
            int color = queries[i][1];  // The new color

            // If the ball already has a color, decrement the count of the previous color
            if (ballColors.containsKey(ball)) {
                int prevColor = ballColors.get(ball);  // Get the previous color
                if (colorCount.containsKey(prevColor)) {
                    // Decrement the previous color count
                    colorCount.put(prevColor, colorCount.get(prevColor) - 1);
                    // If no balls are left with this color, remove it from the map
                    if (colorCount.get(prevColor) == 0) {
                        colorCount.remove(prevColor);
                    }
                }
            }

            // Assign the new color to the ball
            ballColors.put(ball, color);

            // Update the count of the new color
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);

            // Store the number of distinct colors in the result array
            result[i] = colorCount.size();
        }

        return result;  // Return the result array
    }

    public static void main(String[] args) {
        // Example queries
        int[][] queries = {
                {1, 2},  // Ball 1 gets color 2
                {2, 3},  // Ball 2 gets color 3
                {1, 4},  // Ball 1 now gets color 4
                {3, 2}   // Ball 3 gets color 2
        };

        Solution solution = new Solution();
        // Call queryResults method with no usage of limit in this case
        int[] result = solution.queryResults(0, queries);

        // Print the result array
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
