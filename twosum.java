package SecondWeek;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1,1,1,1,1,4,1,1,1,1,1,7,1,1,1,1,1}; //5, 11
		int testT = 11;
	    HashMap<Integer, Integer> numMap = new HashMap<>();
		System.out.println( Arrays.toString(twoSum(test, testT)));

	}
	
	 public static int[] twoSum(int[] nums, int target) {
		 //Contains <conjugate number, index>
	     HashMap<Integer, Integer> numMap = new HashMap<>();
	     int[] answer = new int[2];
		 int otherPair = 0;
	     for(int i = 0; i < nums.length; i++) {
	    	 
	    	 otherPair = target - nums[i];
	    	 System.out.println("OP " + otherPair);
			 if(numMap.containsKey(otherPair)) {
				 answer[0] = i;
				 answer[1] = numMap.get(otherPair);
				 //return answer;
			 }
			 else {
				 numMap.put(otherPair, i);
			 }
			 System.out.println(numMap);
		 }
	     for(int j = 0; j < nums.length; j++) {
	    	 otherPair = target - nums[j];
	    	 System.out.println("Comparing" + otherPair + " To " + nums[j]);

				 if(numMap.containsKey(nums[j]) ) {
					 if((numMap.get(nums[j]) != j)) {
						 answer[0] = j;
				    	 System.out.println("Looking up" + nums[j]);
				    	 System.out.println(numMap.get(nums[j]));
						 answer[1] = numMap.get(nums[j]);
						 return answer;
					 }
				 }
	     }
		 return answer;
	 }
}
