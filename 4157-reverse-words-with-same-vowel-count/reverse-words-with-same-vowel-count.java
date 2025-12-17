class Solution {
    public String reverseWords(String s) {
        
        String[] str = s.split(" ");
        String res = str[0] + " ";
        int cnt1 =0;
        for(char ch:str[0].toCharArray()){
            if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u' )
                cnt1++;
        }
        // System.out.println(cnt1);

        for(int i=1;i<str.length;i++){
            int cnt = 0;
            for(char ch:str[i].toCharArray()){
            if(ch =='a'|| ch =='e'|| ch == 'i'|| ch =='o'|| ch =='u' )
                cnt++;
            }
            // System.out.println(cnt);
            if(cnt == cnt1){

                res += new StringBuilder(str[i]).reverse().toString();
            }
            else 
                res += str[i];
            
            res += " ";
        }

        return res.trim();
    }
}