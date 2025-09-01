class Solution {
    public boolean isValid(String s) {
        if( s.length() == 1) return false;
        char[] stack = new char[s.length()];
        int top = -1;

        for(char ch : s.toCharArray()){
            if(ch == '(' ||ch == '{' || ch == '['){
                top ++;
                stack[top] = ch;
                
            }
            else if (top ==-1)
                return false;
            else if(ch == ')' && stack[top]=='(' )
                top--;
            else if(ch == '}' && stack[top]=='{' )
                top--;
            else if(ch == ']' && stack[top]=='[' )
                top--;
            else 
                return false;
            
        }
        return top == -1 ? true : false;

    }
}