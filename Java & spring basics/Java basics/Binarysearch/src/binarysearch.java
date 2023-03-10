
public class binarysearch {
    public static int findTarget(int[] arr, int target) {
        if (arr.length == 0) return -1;
        int start = 0, end = arr.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (arr[start] == target)  {
            return start;
        }
        if (arr[end] == target) {
            return end;
        }
        return -1;
    }
}



/* Search for the target in a sorted array, and return the index. If the target is not in this array, return -1.

Example:

Input: [1, 5, 7, 8, 9, 11, 18, 19, 20, 25], target=11, output=5.

Input: [1, 2, 3, 4, 5], target=10, output=-1 */