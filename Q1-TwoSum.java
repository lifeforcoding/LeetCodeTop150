public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        //If the result - current element is present in the hashmap then there is a two sum 
        //If not then simply put that element with his respective index in the hashmap
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                break;
            }
            else map.put(nums[i], i);
        }
        return ans;
    }
