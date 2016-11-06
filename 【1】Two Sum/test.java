/**2016.11.5
*/

import java.util.*;
public class test{
    public static int[] twosum(int[] nums, int target){
        int N = nums.length;
        int[] rst = new int[2];
        int start = 0;
        int end   = N-1;

        if(nums == null || N <= 1){    //输入不符合要求
            return rst;
        }

        while(start < end){
            long sum = (long)(nums[start] + nums[end]);
            rst[0] = start;
            rst[1] = end;
            if (target == sum) {
                break;
            }
            else if(target < sum){
                end--;
            }
            else
                start++;
        }
        return rst;
    }

    public static void main (String []args){
        Scanner in=new Scanner(System.in);  
        int N = in.nextInt();
        int []a = new int[N];
        for(int i=0; i < N; i++)
        {
            a[i] = in.nextInt();
        }
        int sum = in.nextInt();
        int[] rst = twosum(a,sum);
        System.out.println(Arrays.toString(rst));
    }

}