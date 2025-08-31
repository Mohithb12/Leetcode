class Solution {
    public boolean isAnagram(String s, String t) {
        int sl=s.length(),tl=t.length();
        
        if(sl != tl)
            return false;
        
        for(int i=0;i<sl;i++){
            char ch = s.charAt(i);
            if(t.contains(String.valueOf(ch)))
                t = t.replaceFirst(""+ch,"");
            else 
                return false;
        }

        return t.length() == 0 ?  true :  false;
    }
}