class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length() <= 1) return false;

        for(char ch:s.toCharArray()){
            if(ch == '[')
                stack.push(']');
            else if(ch == '(')
                stack.push(')');
            else if(ch == '{')
                stack.push('}');

            else if(!stack.isEmpty()){ 
                char top = stack.peek();
                if(top == ch){
                    stack.pop();
                }
                else 
                    return false;
                       
            }
            else 
                return false;
            
            
        }
        if(stack.isEmpty())
        return true;

        return false;
    }
}