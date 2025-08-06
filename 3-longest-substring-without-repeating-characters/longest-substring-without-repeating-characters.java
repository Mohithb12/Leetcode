class Solution {
    public int lengthOfLongestSubstring(String s) {
        // String longest_sub = new String();

        // We need to find length
        
        int max_len =0;
        int cnt =0 ;
        int n = s.length();

       Set<Character> se = new HashSet<>();

        for(int i=0;i<n;i++)
        {   se.clear();
            
             for(int j= i;j<n;j++)
            {   char ch = s.charAt(j);
                if(se.contains(ch))
                {
                   
                    break;}

                se.add(ch);

                cnt = j - i + 1;

                max_len = Math.max(max_len,cnt);

                
            }

            max_len = Math.max(max_len,cnt);
                
            }

            return max_len;
        }

        
    }
