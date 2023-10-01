class Solution {
    public String reverseWords(String s){
        String reverse = "";
        String ans = "";
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != ' '){
                reverse = ch + reverse;
            } else  {
                ans = ans + reverse + " "; 
                reverse = "";
            }
        }
        if(reverse.length() > 0) 
            ans += reverse;
        return ans;
    }
}