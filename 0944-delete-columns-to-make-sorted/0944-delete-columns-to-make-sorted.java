class Solution {
    public int minDeletionSize(String[] strs) {
        int col = strs[0].length();
        int ans = 0;
        int row = strs.length;
        for(int j=0; j<col; j++){
            String s = "";
            for(int i=0; i<row; i++){
                s+=strs[i].charAt(j);
            }
            // System.out.println(s);
            char[] charS = s.toCharArray();
            Arrays.sort(charS);
            String sorted = String.copyValueOf(charS);
            // System.out.println(sorted);
            if(!s.equals(sorted))       ans++;
        }
        return ans;
    }
}