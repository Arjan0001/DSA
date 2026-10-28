/*
Second Largest Element
Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.
Example 1:

Input: nums = [8, 8, 7, 6, 5]

Output: 7

Explanation:

The largest value in nums is 8, the second largest is 7
Example 2:

Input: nums = [10, 10, 10, 10, 10]

Output: -1

Explanation:

The only value in nums is 10, so there is no second largest value, thus -1 is returned
*/

// better solution
class Solution {
    public int secondLargestElement(int[] nums) {
    int largest = nums[0];
    int slargest =-1;
    for(int i=1;i<=nums.length-1;i++){
        if(largest<nums[i]){
            largest = nums[i];
        }
    }
    for(int i=0;i<=nums.length-1;i++){
        if(slargest<nums[i] && largest!=nums[i]){
           slargest=nums[i];
        }
    }

    return slargest;
    }

}
