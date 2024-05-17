public class LongestIncreasingSequence {
    public static int[] findLongestSequence(int[] arr) {
        int maxLength = 0;
        int currentLength = 1;
        int start = 0;
        int currentStart = 0;
        int numSequences = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = currentStart;
                    numSequences = 1;
                } else if (currentLength == maxLength) {
                    numSequences++;
                }
            } else {
                currentStart = i;
                currentLength = 1;
            }
        }

        int[] longestSequence;
        if (numSequences > 1) {
            longestSequence = getSmallestStartingSequence(arr, start, maxLength);
        } else {
            longestSequence = new int[maxLength];
            int index = 0;
            for (int i = start; i < start + maxLength; i++) {
                longestSequence[index] = arr[i];
                index++;
            }
        }

        return longestSequence;
    }

    public static int[] getSmallestStartingSequence(int[] arr, int start, int maxLength) {
        int[] longestSequence = new int[maxLength];
        int index = 0;
        int smallestStartingIndex = start;
        for (int i = start + 1; i < start + maxLength; i++) {
            if (arr[i] < arr[smallestStartingIndex]) {
                smallestStartingIndex = i;
            }
        }

        for (int i = smallestStartingIndex; i < smallestStartingIndex + maxLength; i++) {
            longestSequence[index] = arr[i];
            index++;
        }

        return longestSequence;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 7, 8, 4, 9, 10, 11};
        int[] longestSequence = findLongestSequence(arr);

        System.out.println("Longest increasing sequence:");
        for (int num : longestSequence) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr2 = {1, 2, 3, 2, 5, 7, 8, 4, 9, 10, 11, 2, 3, 4, 5};
        int[] longestSequence2 = findLongestSequence(arr2);

        System.out.println("Longest increasing sequence:");
        for (int num : longestSequence2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}