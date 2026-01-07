class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> maps  = new HashMap<>();
        HashMap<Character,Character> mapt  = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(maps.containsKey(ch)){
                if(maps.get(ch) != t.charAt(i))
                    return false;
            }
            else
                maps.put(ch,t.charAt(i));

            ch = t.charAt(i);

            if(mapt.containsKey(ch)){
                if(mapt.get(ch) != s.charAt(i))
                    return false;
            }
            else 
                mapt.put(ch,s.charAt(i));
        }

        return true;
    }
}