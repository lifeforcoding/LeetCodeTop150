public void merge(int[] nums1, int m, int[] nums2, int n) {
        int completed = (m + n) - 1;
        int i = m - 1, j = n - 1;
        //Here the Logic is we starting comparing from last element of both the array and keep putting the element in the index of nums1
        while (i >= 0 && j >= 0) {
            nums1[completed--] = (nums1[i] > nums2[j])? nums1[i--] : nums2[j--];
        }
        //After completion of the loop there is a chance of remaining element left in the nums 2 array, this case arrise when the nums
        //2 array have larger elements from all the element of the nums1. So this loop will help in handle the remaining element from the nums 2 array 
        while (j >= 0)
            nums1[completed--] = nums2[j--];
    }
