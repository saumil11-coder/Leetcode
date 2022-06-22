class Solution {

    public double myPow(double x, int n) {
        double answer = 1.0;
        long storingVariable = n;
        if (storingVariable < 0) {
            storingVariable = -1 * storingVariable;
        }
        while (storingVariable > 0) {
            if (storingVariable % 2 == 0) {
                x = x * x;
                storingVariable /= 2;
            } else {
                answer = answer * x;
                storingVariable -= 1;
            }
        }
        if (n < 0) answer = (double)(1.0) /(double)(answer);
        return answer;
    }
}
