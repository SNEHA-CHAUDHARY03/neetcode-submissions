class Solution {
    public int trap(int[] height) {
        int ans= 0;
        for(int i=0;i<height.length;i++){
            int leftmax = 0;
            int rightmax = 0;
            for(int a = 0;a<=i;a++){
                leftmax = Math.max(leftmax,height[a]);
            }
            for(int b =i;b<height.length;b++){
                rightmax = Math.max(rightmax,height[b]);
            }
            ans += Math.max(0,Math.min(leftmax,rightmax)-height[i]);
        }
        return ans;
    }
}
