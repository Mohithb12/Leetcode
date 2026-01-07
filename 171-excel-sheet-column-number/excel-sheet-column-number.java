class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        int len = columnTitle.length();
        for(int i=len-1;i>=0;i--){

            int num = ((int)( columnTitle.charAt(i) - 'A') );
            // System.out.println(num);

            res = res +( (int)Math.pow(26,(len - i-1)) * (num+1));
            // System.out.println(res);
        }

        return res;
    }
}