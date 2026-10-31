class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        int n=nums.length;
        int i=0;
        int longest=0;
        while(i<n)
        {
            if (!hs.contains(nums[i] - 1)) {
                int length = 1;
                while (hs.contains(nums[i] + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
            i++;
        }
        return longest;

    }
}
