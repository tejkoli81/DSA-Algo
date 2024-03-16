package leetcode;

public class pr34_FindFirstLast_Position_of_Element_in_Sorted_Array {
    public static int[] poststrthigh(int nums[], int target) {
        int left = findLeftBound(nums, target);
        int right = findRightBound(nums, target);
    
        return new int[]{left, right};
      }
    
      private static int findLeftBound(int[] nums, int target) {
        int index = -1, low = 0, high = nums.length - 1;
    
        // Standard binary search
        while (low <= high) {
          int mid = low + (high - low) / 2;
    
          if (nums[mid] == target) {
            index = mid;
            high = mid - 1; // Look in the left sub-array
          }
          else if (nums[mid] < target)
            low = mid + 1;
          else
            high = mid - 1;
        }
    
        return index;
      }
    
      private static int findRightBound(int[] nums, int target) {
        int index = -1, low = 0, high = nums.length - 1;
    
        // Standard binary search
        while (low <= high) {
          int mid = low + (high - low) / 2;
    
          if (nums[mid] == target) {
            index = mid;
            low = mid + 1; // Look in the right sub-array
          }
          else if (nums[mid] < target)
            low = mid + 1;
          else
            high = mid - 1;
        }
    
        return index;
      }
    
    

    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int key = 8;

        int ar[] = poststrthigh(arr, key);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

    }

}
