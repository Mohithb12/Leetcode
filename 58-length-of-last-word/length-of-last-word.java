class Solution {
    public int lengthOfLastWord(String s) {
        String[] strar = s.split(" ");
        String last = strar[strar.length -1];
        return last.length();
    }
}