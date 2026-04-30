class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap< Character, Integer> map=new HashMap<>();
        // Step 1: count s
        for(int i = 0; i < s.length(); i++){
            char s1 = s.charAt(i);
            map.put(s1, map.getOrDefault(s1, 0) + 1);
        }

        // Step 2: subtract t
        for(int i = 0; i < t.length(); i++){
            char t1 = t.charAt(i);

            if(!map.containsKey(t1)){
                return false;
            }

            map.put(t1, map.get(t1) - 1);
        }

        // Step 3: check zero
        for(int val : map.values()){
            if(val != 0){
                return false;
            }
        }

        return true;
    }
}
        