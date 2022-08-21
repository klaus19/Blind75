
//You are given an integer array height of length n.
// There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains the most water.

public class Container {

    public int maxArea(int []nums){
        int max_area=0;
        int a_pointer=0;
        int b_pointer= nums.length-1;

        while (a_pointer<b_pointer){
            if (nums[a_pointer]<nums[b_pointer]){
                max_area = Math.max(max_area,nums[a_pointer]*(b_pointer-a_pointer));
                a_pointer++;
            }else {
                max_area = Math.max(max_area,nums[b_pointer]*(b_pointer-a_pointer));
                b_pointer--;
            }
        }
        return max_area;
    }
}
