class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int ans = -1 , curr = 0, total = 0;
        for(int i=0;i<n;++i){
            int diff = gas[i]-cost[i];
            curr += diff; total += diff;
            if(curr<0){
                curr = 0;
                ans = i;
            }
        }
        if(total>=0) return ans+1;
        return -1;
    }
}