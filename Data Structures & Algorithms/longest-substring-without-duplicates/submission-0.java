class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int res=0;
        int r=0;
        HashSet<Character> charset=new HashSet<>();
        int curlen=0;
        while(r<s.length())
        {
            while(charset.contains(s.charAt(r)))
            {
                charset.remove(s.charAt(l));
                l=l+1;
            }
         curlen=(r-l+1);
         charset.add(s.charAt(r));
         res=Math.max(res,curlen);
         r++;
        }
        return res;
    }
}
