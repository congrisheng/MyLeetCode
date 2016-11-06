public class Solution{
	public int[] twosum(int[] nums, int target){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int[] result = new int[2];

		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(nums[i])){
				int index = map.get(nums[i]);
				result[0] = index;
				result[1] = i;
				break;
			}else{
				map.put(target - nums[i], i);
			}
		}
		return result;
	}
}