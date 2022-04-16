// T.C O(n)
// S.C O(1)

class Solution {
    int skip;
    public int rob(int[] nums) {        
        if(nums==null || nums.length==0)return 0;
        int n=nums.length;       
        int take=nums[0];    
        for(int i=1;i<n;i++){
            int temp=take;
           take=nums[i]+skip;
            skip=Math.max(skip,temp);
        }
        return Math.max(skip,take);
    }    
  }
