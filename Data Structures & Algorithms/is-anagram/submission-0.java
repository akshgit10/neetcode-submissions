class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] countarr=new int[26];
        for(char ch : s.toCharArray())
        {
            countarr[ch-'a']++;
        }
        for(char ch:t.toCharArray())
        {
            countarr[ch-'a']--;
        }
        int cnt=0;
        for(int i=0;i<countarr.length;i++)
        {
            if(countarr[i]==0)
            {
                cnt++;
            }
        }
        if(cnt==26)
        {
            return true;
        }
        return false;



    }
}
