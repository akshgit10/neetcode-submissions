class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
          int n = temperatures.length;
    int[] daysOfWait = new int[n];
    Arrays.fill(daysOfWait, 0);
    Stack<Integer> s = new Stack<>();
    for(int i = 0; i < n; i++)
    {
        while (!s.isEmpty() && temperatures[s.peek()] < temperatures[i])
        {
            daysOfWait[s.peek()] = i - s.peek();
            s.pop();
        }
        s.push(i);
    }

    return daysOfWait;
    }
    
}
