package Arrays;

//Given an integer array nums, return an array answer such that
// answer[i] is equal to the product of all the elements of nums except nums[i].

import java.util.Arrays;

public class ProductExceptSelf {


    public int[] productExceptSelf(int[] nums) {

        int output[] = new int[nums.length];

        output[0]=1;

        // left prefix product
        for (int i=1;i<nums.length;i++){
            output[i]=output[i-1]*nums[i-1];

        }
        int product=1;
        for(int i=nums.length-1;i>=0;i--){

            output[i] = output[i] * product;

            product*= nums[i];
        }
        return output;

    }

    public static void main(String[] args) {
        ProductExceptSelf pd = new ProductExceptSelf();
        int [] pt = new int[]{2,3,4};
        System.out.println(Arrays.toString(pd.productExceptSelf(pt)));
    }
}
