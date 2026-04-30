class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return true; // duplicate found
            }
            set.add(num);
        }

        return false; // no duplicate  
    }
}