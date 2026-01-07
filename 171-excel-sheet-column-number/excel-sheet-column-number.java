class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        int len = columnTitle.length();
        for(int i=len-1;i>=0;i--){

            int num = ((int)( columnTitle.charAt(i) - 'A') );

            res = res + (int)Math.pow(26,(len-1-i)) * (num+1);
        }

        return res;
    }
}