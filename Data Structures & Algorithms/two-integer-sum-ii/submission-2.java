class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<numbers.length;i++){
            int diff = target-numbers[i];
            if(map.containsKey(diff)){
                ans[1] = i+1;
                ans[0] = map.get(diff)+1;
            }else{
                map.put(numbers[i],i);
            }
        }
        return ans;
    }
}
