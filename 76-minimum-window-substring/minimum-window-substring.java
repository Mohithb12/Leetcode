class Solution {
    public String minWindow(String s, String t) {
        
        int minlen = (int) 1e9;
        int sind = -1;

        int[] hash = new int[256];
        int cnt =0;
        Arrays.fill(hash,0);
        for(int j=0;j<t.length();j++)
            hash[t.charAt(j)]++;

        int l=0,r=0;
            

        while(r < s.length()){

            char cr = s.charAt(r);

            hash[cr]--; 
                
            if (hash[cr] >= 0) 
                cnt++;
            

            while(cnt == t.length())
            {
                if(r-l+1 < minlen){
                    minlen = r - l +1;
                    sind = l;
                }
                
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0) cnt --;
                
                l++;
                
            }
            
            r++;
            
        }
           
         return sind == -1 ? "" : s.substring(sind, sind + minlen);

    }
}
