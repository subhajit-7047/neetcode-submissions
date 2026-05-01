class Solution {
    public int[] productExceptSelf(int[] nums) {

        //using prefix and suffix product
         int n = nums.length;
    int[] answer = new int[n];

    // Step 1: Build prefix (store in answer)
    answer[0] = 1;
    for (int i = 1; i < n; i++) {
        answer[i] = answer[i - 1] * nums[i - 1];
    }

    // Step 2: Traverse from right and multiply suffix
    int rightProduct = 1;
    for (int i = n - 1; i >= 0; i--) {
        answer[i] = answer[i] * rightProduct;
        rightProduct = rightProduct * nums[i];
    }

    return answer;
        
    }
}  
