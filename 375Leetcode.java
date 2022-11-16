/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=1;
        int end=n;
        while(start<=end)
        {
            int middleElement=end+(start-end)/2;
            if(guess(middleElement)==0)
            return middleElement;
            else if(guess(middleElement)==-1)
             end =middleElement-1;
            else start=middleElement+1;
        }
        return -1;
    }
}