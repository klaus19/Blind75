package Arrays;

//Given an integer array nums, return an array answer such that
// answer[i] is equal to the product of all the elements of nums except nums[i].

public class ProductExceptSelf {


    public int[] productExceptSelf(int[] nums) {

        int N = nums.length;

      int[]L = new int[N];
      int[]R = new int[N];
      int pointer=1;
      int[]output_array = new int[N];

      L[0]=1;
      R[N-1]=1;

      for (int i=1;i<N;i++){
          L[i]=nums[i-1]*L[i-1];

      }

      for (int i=N-2;i>=0;i--){
          R[i]=nums[i+1]*R[i+1];
      }

      for (int i=0;i<N;i++){
          output_array[i]=L[i]*R[i];
      }

      return output_array;

    }
}
