class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash = new int[26];
        Arrays.fill(hash,0);
        int maxf =0;
        int changes = 0;
        int n = s.length();
        int maxlen=0;
        int l=0,r=0;

        //  Brute
        /*
        for(int i = 0;i<n;i++)
        {   Arrays.fill(hash,0);
            for(int j=i;j<n;j++)
            {
                hash[s.charAt(j)-'A']++;
                maxf = Math.max(maxf,hash[s.charAt(j)-'A']);
                changes = (j-i +1) -maxf;
                if(changes <=k)
                {
                    maxlen = Math.max(maxlen,j-i+1);
                }
                else
                    break;
            }
        }
        */

        while(r < s.length())
        {
            hash[s.charAt(r) - 'A']++;
            maxf =Math.max(maxf, hash[s.charAt(r) - 'A']);

            while(r-l+1 - maxf > k)
            {   
                hash[s.charAt(l)-'A']--;
                l++;
            }

            maxlen = Math.max(maxlen,r-l+1);
            r++;

        }

        return maxlen;
    }
}