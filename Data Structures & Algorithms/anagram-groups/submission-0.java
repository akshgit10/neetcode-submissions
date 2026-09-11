class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> mpp=new HashMap<>();

        for(String s: strs)
        {
            char[] chararr=s.toCharArray();
            Arrays.sort(chararr);
            String sortedS=new String(chararr);
            if(!mpp.containsKey(sortedS))
            {
                mpp.put(sortedS,new ArrayList<>());
            }
            mpp.get(sortedS).add(s);
        }
        return new ArrayList<>(mpp.values());
    }
}
