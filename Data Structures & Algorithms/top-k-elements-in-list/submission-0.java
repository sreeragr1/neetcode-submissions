class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequency = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < nums.length; i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }

        // Put numbers into buckets
        for (int key : frequency.keySet()) {

            int freq = frequency.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        // Collect top k
        int[] res = new int[k];
        int counter = 0;

        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {

            if (bucket[pos] != null) {

                for (Integer integer : bucket[pos]) {
                    res[counter++] = integer;

                    if (counter == k) {
                        break;
                    }
                }
            }
        }

        return res;
    }
}