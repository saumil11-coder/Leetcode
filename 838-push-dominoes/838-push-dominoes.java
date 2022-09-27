class Solution {
    public String pushDominoes(String dominoes) {
        int[] left = new int[dominoes.length()];
        int[] right = new int[dominoes.length()];
        for (int i = 0; i < left.length; i++) {
            if (dominoes.charAt(i) == 'R'){
                right[i] = 1;
                continue;
            }
            if (dominoes.charAt(i) == 'L'){
                continue;
            }
            if (dominoes.charAt(i) == '.'){
                if (i == 0) continue;
                if (right[i - 1] > 0) {
                    right[i] = right[i - 1] + 1;
                }
                continue;
            }
        }
        for (int i = right.length - 1; i >= 0; i--) {
            if (dominoes.charAt(i) == 'L'){
                left[i] = -1;
                continue;
            }
            if (dominoes.charAt(i) == 'R'){
                continue;
            }
            if (dominoes.charAt(i) == '.'){
                if (i == right.length - 1) continue;
                if (left[i + 1] < 0) {
                    left[i] = left[i + 1] - 1;
                }
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < left.length; i++) {
            if (left[i] + right[i] == 0) {
                sb.append('.');
            }else if (left[i] == 0 || right[i] == 0){
                if (left[i] + right[i] < 0) {
                    sb.append('L');
                }else {
                    sb.append('R');
                }
            }else if (left[i] + right[i] < 0) {
                sb.append('R');
            }else {
                sb.append('L');
            }
            System.out.print(left[i]);
        }
        return sb.toString();
    }
}