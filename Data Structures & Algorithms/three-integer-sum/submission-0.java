class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
    continue;
}
            int curr = -nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[left]+ nums[right];
                if(sum<curr) left++;
                else if(sum>curr) right--;
                else if(sum==curr){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
temp.add(nums[left]);
temp.add(nums[right]);
                    ans.add(temp);
                    while (left < right && nums[left] == nums[left + 1]) {
    left++;
}

while (left < right && nums[right] == nums[right - 1]) {
    right--;
}
                    left++;
                    right--;
                }
            }

        }
        return ans;
    }
}
