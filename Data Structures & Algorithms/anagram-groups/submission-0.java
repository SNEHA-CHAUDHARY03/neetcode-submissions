class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(!map.containsKey(temp)){
                map.put(temp, new ArrayList<>());
            }
            map.get(temp).add(str);

        }
        return new ArrayList<>(map.values());
    }
}
