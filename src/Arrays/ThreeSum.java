package Arrays;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>>threeSum(int[]nums){

        Arrays.sort(nums);
        Set<List<Integer>>triplets = new HashSet<>();

       for (int left=0;left<nums.length;left++){
           int mid=left+1;

           int right = nums.length-1;
           while (mid<right){
               int sum = nums[left]+nums[mid]+nums[right];
               if (sum<0){
                   mid++;
               }else if (sum>0){
                   right--;
               }
               else {
                   List<Integer>triplet = Arrays.asList(nums[left],nums[mid],nums[right]);
                   triplets.add(triplet);
                   mid++;
               }
           }
       }


       return new ArrayList<>(triplets);
    }
}
