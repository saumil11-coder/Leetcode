class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
         return list(map(list,zip(*matrix)))
        