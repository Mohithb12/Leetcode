class Solution {
    public int lengthOfLongestSubstring(String s) {
        // String longest_sub = new String();

        // We need to find length
        
        int longest_sub =0;
        int cnt =0 ;
        int n = s.length();

       

        for(int i=0;i<n;i++)
        {   
             Set<Character> se = new HashSet<>();
             for(int j= i;j<n;j++)
            {   char ch = s.charAt(j);
                if(se.contains(ch))
                {
                   
                    break;}

                se.add(ch);

                cnt = j - i + 1;

                longest_sub = Math.max(longest_sub,cnt);

                
            }

            longest_sub = Math.max(longest_sub,cnt);
                
            }

            return longest_sub;
        }

        
    }
