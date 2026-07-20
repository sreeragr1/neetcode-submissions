class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0 ;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);


        }
        List<Integer>[] arr = new List[nums.length+1];
        for(int x : map.keySet()){
            int freq = map.get(x);
            if(arr[freq] == null){
                arr[freq] = new ArrayList<>();
            }
            arr[freq].add(x);

        }
        int [] result = new int [k];
        int index = 0;
        for(int i = arr.length-1;i>0 && index <k ;i--){
            if(arr[i]!= null){
                for(int x : arr[i]){
                    result[index++]=x;
                    if(index == k)break;
                }
            }

        
    }
    return result;
}
}