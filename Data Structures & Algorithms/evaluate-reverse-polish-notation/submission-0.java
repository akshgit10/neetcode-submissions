class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> tokenStack=new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
        String t = tokens[i];
        if (!t.equals("+") && !t.equals("-") && !t.equals("*") && !t.equals("/")) {
            // It's a number! Push it to the stack
            tokenStack.push(Integer.parseInt(t));
        } else {
            // It's an operator (+, -, *, /)
            int b = tokenStack.pop();
            int a = tokenStack.pop();
            
            if (t.equals("+")) tokenStack.push(a + b);
            else if (t.equals("-")) tokenStack.push(a - b);
            else if (t.equals("*")) tokenStack.push(a * b);
            else if (t.equals("/")) tokenStack.push(a / b);
        }
    }
    return tokenStack.pop();
    }
}
