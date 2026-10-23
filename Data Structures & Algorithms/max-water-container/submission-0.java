class Solution {
    public int maxArea(int[] heights) {
        int p1=0;
        int p2=heights.length-1;
        int maxarea=0;
        while(p1<p2)
        {
            int currarea=Math.min(heights[p1],heights[p2])*(p2-p1);
            maxarea=Math.max(maxarea,currarea);
            if(heights[p1]<=heights[p2])
            {
                p1++;
            }
            else{
                p2--;
            }
        }
        return maxarea;
    }
}
