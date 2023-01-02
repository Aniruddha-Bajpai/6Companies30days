class Solution {
    public int evalRPN(String[] tokens) {
        /**
        A reverse polish notation is a mathematical notation where operators follow the operands
        2+3(Normal)  ------> 2 3 + (RPN)
        */
        Stack<Integer> stck = new Stack<>();
        int f,s;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                f = stck.peek(); stck.pop();
                s = stck.peek(); stck.pop();
                stck.push(f+s);
            } else if(tokens[i].equals("-")){
                f = stck.peek();  stck.pop();
                s =  stck.peek(); stck.pop();
                stck.push(s-f);
            } else if(tokens[i].equals("*")){
                f = stck.peek(); stck.pop();
                s = stck.peek(); stck.pop();
                stck.push(f*s);
            } else if(tokens[i].equals("/")){
                f = stck.peek(); stck.pop();
                s = stck.peek(); stck.pop();
                stck.push(s/f);
            } 
            else 
                stck.push(Integer.parseInt(tokens[i]));
        } return stck.peek();
    }
}