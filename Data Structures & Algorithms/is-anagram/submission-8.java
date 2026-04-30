class Solution {
    public boolean isAnagram(String s, String t) {

        //optimized solution , Tc=0{n}/ Sc=0(1)-> as always 26 array size....
        if(s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;  // s → +1
            count[t.charAt(i) - 'a']--;  // t → -1
        }

        for(int val : count){
            if(val != 0){
                return false;
            }
        }

        return true;
        
    }
}
        