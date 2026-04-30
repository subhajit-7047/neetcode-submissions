class Solution(object):
    def groupAnagrams(self, strs):
        from collections import defaultdict

        anagram_map = defaultdict(list)

        for word in strs:
            # Sort the word and use as key
            sorted_word = ''.join(sorted(word))
            # Group by the sorted word
            anagram_map[sorted_word].append(word)

        # Return only the grouped anagram lists
        return list(anagram_map.values())

        