class Solution(object):
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        """
        :type buckets: int
        :type minutesToDie: int
        :type minutesToTest: int
        :rtype: int
        """
        test=minutesToTest//minutesToDie
        i=0
        while((test+1)**i)<buckets:
            i+=1
        return i;
        