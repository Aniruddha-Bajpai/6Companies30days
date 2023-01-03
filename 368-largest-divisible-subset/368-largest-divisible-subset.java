class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] track_ = new int[n];
        Arrays.sort(nums);
        int mx = 0  ;
        int indx = -1;
        for(int i=0;i<n;i++){
            dp[i] = 1;
            track_[i] = -1;
            for(int j=i-1;j>=0;j--){
                if(nums[i]%nums[j]==0 && dp[j]+1 > dp[i]){
                    dp[i] = dp[j]+1;
                    track_[i] = j;
                }
            }
            if(dp[i]>mx){
                mx = dp[i];
                indx = i;
            }
        }
        List<Integer> result =new ArrayList<>();
        while(indx!=-1){
            result.add(nums[indx]);
            indx = track_[indx];
        } return result;
        
    }
}