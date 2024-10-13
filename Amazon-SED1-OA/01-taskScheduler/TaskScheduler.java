import java.util.Arrays;
import java.util.List;

public class TaskScheduler {

    /**
     * Determines the maximum number of secondary tasks that can be scheduled
     * during n days while adhering to the given constraints.
     *
     * @param limit     the daily time limit for primary and secondary tasks.
     * @param primary   the list of durations for the primary tasks.
     * @param secondary the list of durations for the secondary tasks.
     * @return the maximum number of secondary tasks that can be scheduled.
     */
    public static int getMaximumTasks(int limit, List<Integer> primary, List<Integer> secondary) {
        int n = primary.size();

        // Array to store remaining time after scheduling primary tasks each day
        int[] remainingTime = new int[n];

        // Calculate the remaining time for each day after scheduling primary tasks
        for (int i = 0; i < n; i++) {
            remainingTime[i] = limit - primary.get(i);
        }

        // Sort the remaining times in ascending order
        Arrays.sort(remainingTime);

        // Convert the list of secondary task durations to an array and sort it
        int[] secondaryTasks = new int[n];
        for (int i = 0; i < n; i++) {
            secondaryTasks[i] = secondary.get(i);
        }
        Arrays.sort(secondaryTasks);

        int count = 0; // Counter for the number of secondary tasks scheduled
        int secondaryIndex = 0; // Pointer for secondary tasks array

        // Iterate over each day's remaining time
        for (int i = 0; i < n && secondaryIndex < n; i++) {
            // Check if the current secondary task can fit into the day's remaining time
            if (secondaryTasks[secondaryIndex] <= remainingTime[i]) {
                count++; // Increment the count as the task can be scheduled
                secondaryIndex++; // Move to the next secondary task
            }
            // If the secondary task doesn't fit, try the next day's remaining time
        }

        return count; // Return the maximum number of secondary tasks scheduled
    }




    public static void main(String[] args) {
        List<Integer> primary = List.of(4, 5, 2, 4);
        List<Integer> secondary = List.of(5, 6, 3, 4);
        int limit = 7;

        int result = getMaximumTasks(limit, primary, secondary);
        System.out.println("The maximum number of secondary tasks that can be scheduled is: " + result);
    }
}
