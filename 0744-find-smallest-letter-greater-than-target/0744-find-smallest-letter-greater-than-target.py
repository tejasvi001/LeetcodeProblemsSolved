class Solution(object):
    def nextGreatestLetter(self, letters, target):
        """
        :type letters: List[str]
        :type target: str
        :rtype: str
        """
        letter=letters[0]
        for i in letters :
            if i > target :
                letter = i
                break
        return letter
        