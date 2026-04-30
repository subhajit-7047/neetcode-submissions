class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap< Character, Integer> maps=new HashMap<>();
        HashMap<Character, Integer> mapt=new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }
    for(int i=0;i<s.length();i++){
        char s1=s.charAt(i);
        char t1=t.charAt(i);

        maps.put(s1,maps.getOrDefault(s1, 0)+1);
        mapt.put(t1,mapt.getOrDefault(t1,0)+1);

    }
    if(maps.equals(mapt)){
        return true;
    }
    return false;
    }
}
