class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        if word.upper() == word:
            return True
        elif (word[0].upper() == word[0] and word[1:].lower()==word[1:]):
            return True
        elif word.lower() == word:
            return True
        return False
            
            
            
        