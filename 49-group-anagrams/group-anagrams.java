class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String , List<String>> res = new HashMap<>();

        for(String s:strs){
            char[] chs = s.toCharArray();
            Arrays.sort(chs);
            String key = new String(chs);

            if(!res.containsKey(key)){
                res.put(key,new ArrayList<>());
            }
            res.get(key).add(s);
        }


        return new ArrayList<>(res.values());
    }
}