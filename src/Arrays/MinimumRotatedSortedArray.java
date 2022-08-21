package Arrays;

//Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//You must write an algorithm that runs in O(log n) time.

public class MinimumRotatedSortedArray {

    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length;

        while (low<= high){

            int mid = low+(high-low)/2;

            if (nums[mid]<nums[mid-1]){
                return nums[mid];
            }else if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }else if(nums[low]<=nums[mid]){
                low = mid+1;
            }else if(nums[mid]<=nums[high]){
                high = mid-1;
            }

        }
        return -1;
    }
}
