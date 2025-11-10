class Solution {
    public int minOperations(int[] nums) {
        int index = 0;
        int n = nums.length;    
        int lastMin = -1;
        for(index = 0;index<n;index++){
            int count = 0;
            int min = Integer.MAX_VALUE;
            for(int num : nums){
                if(num<min && num>lastMin){
                    count = 1;
                    min = num;
                }
                if(num == min){
                    count++;
                }
            }
            if(count == 0)break;
            lastMin = min;
        }
        return index;
    }
}
