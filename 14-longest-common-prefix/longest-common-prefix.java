class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];

        for(int i=1;i<strs.length;i++)
        {
            String s = strs[i];
            int length = common.length() < s.length() ? common.length() : s.length();
            if(length == 0)
                common = "";
            for(int j=0;j<length;j++)
            {
                if(s.charAt(j) != common.charAt(j))
                {
                    common = common.substring(0,j);
                    break;
                }
                if(j == length-1)
                   common = common.substring(0,length); 
            }
            
        }

        return common;

    }
}