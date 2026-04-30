class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap< Character, Integer> maps=new HashMap<>();
        HashMap<Character, Integer> mapt=new HashMap<>();
    // Step 1: length check
        if(s.length()!=t.length()){
            return false;
        }

         // Step 2: build frequency maps
    for(int i=0;i<s.length();i++){
        char s1=s.charAt(i);
        char t1=t.charAt(i);

        maps.put(s1,maps.getOrDefault(s1, 0)+1);
        mapt.put(t1,mapt.getOrDefault(t1,0)+1);

    }
        // Step 3: compare maps
    if(maps.equals(mapt)){
        return true;
    }
    return false;
    }
}
