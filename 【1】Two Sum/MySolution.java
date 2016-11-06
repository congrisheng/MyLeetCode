/**2016.11.5

*/
public class MySolution{
	public int[] twosum(int[] nums, int target){
		int N = nums.length;
        int[] rst = new int[2];
        int start = 0;
        int end   = N-1;

        if(nums = null || N <= 1){    //输入不符合要求
        	return rst;
        }

        while(Start < end){
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
}