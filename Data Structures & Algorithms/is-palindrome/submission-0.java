class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        int p1=0;
        int p2=s.length()-1;
        while(p1<p2)
        {
            char cLeft = s.charAt(p1);
            char cRight = s.charAt(p2);
            if (!Character.isLetterOrDigit(cLeft)) {
                p1++;
            } 
            else if (!Character.isLetterOrDigit(cRight)) {
                p2--;
            }
            else {
                if (Character.toLowerCase(cLeft) !=Character.toLowerCase(cRight))   {
                    return false;
                }
                p1++;
                p2--;
            }
        }
        return true;
    }
}
