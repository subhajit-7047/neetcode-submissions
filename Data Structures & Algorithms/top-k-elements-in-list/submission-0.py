class Solution(object):
    def topKFrequent(self, nums, k):
        freq = {}  # frequency dictionary

        # Count frequency of each number
        for num in nums:
            if num in freq:
                freq[num] += 1
            else:
                freq[num] = 1

        # Sort the items by frequency in descending order
        sorted_items = sorted(freq.items(), key=lambda x: x[1], reverse=True)

        # Extract the top k elements
        result = [item[0] for item in sorted_items[:k]]

        return result
