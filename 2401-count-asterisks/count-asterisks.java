class Solution {
    public int countAsterisks(String s) {
        int cnt =0;
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '|')
            {
                flag = !flag;
            }
            else{
                if(flag == true)
                {
                    if(ch == '*')
                        cnt++;
                }
                }
        }

        return cnt;
    }
}