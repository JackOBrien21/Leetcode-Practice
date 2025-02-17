class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """

        left = 0
        right = len(nums)-1

        while left <= right:
            mid = right+(left-right)/2

            if nums[mid] < target:
                left = mid+1
            elif nums[mid]==target:
                return mid
            else:
                right = mid-1

        return left
        