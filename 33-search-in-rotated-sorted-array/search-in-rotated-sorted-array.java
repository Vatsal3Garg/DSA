class Solution {
    public int search(int[] arr, int target) {
           int s = 0, e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == target) return m;

            // Left half is sorted
            if (arr[s] <= arr[m]) {
                if (target >= arr[s] && target < arr[m]) {
                    e = m - 1; // search left
                } else {
                    s = m + 1; // search right
                }
            }
            // Right half is sorted
            else {
                if (target > arr[m] && target <= arr[e]) {
                    s = m + 1; // search right
                } else {
                    e = m - 1; // search left
                }
            }
        }

        return -1; // not found
    }

    }
