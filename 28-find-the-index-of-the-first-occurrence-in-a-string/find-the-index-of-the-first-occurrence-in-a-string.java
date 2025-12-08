class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) return -1;
        int small=-1;
      for(int i=0;i<haystack.length()-needle.length()+1;i++){
        for(int j=0;j<needle.length();j++){
            if(haystack.charAt(i+j) != needle.charAt(j))
                break;
            else if(j == needle.length()-1)
                return i;
        }
      }

      return small;

    }
}