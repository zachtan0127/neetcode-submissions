class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed = target - nums[i];
            if(seen.containsKey(needed)){//backtracking to see if we have needed saved
                return new int[]{seen.get(needed),i}; //getting THE KEY that has the value of needed
            }
            seen.put(nums[i],i); //add into hashmap
        }
        return new int[]{};
    }
}
