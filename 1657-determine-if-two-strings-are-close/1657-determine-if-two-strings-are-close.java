class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        boolean trace[]=new boolean[26];
        int[] w1=new int[26];
        int[] w2=new int[26];
        for(int i=0;i<word2.length();i++){
            int n=word2.charAt(i)-'a';
            if(!trace[n]) trace[n]=true;
            w2[n]++;
        }

        for(int i=0;i<word1.length();i++){
            int n=word1.charAt(i)-'a';
            if(!trace[n]){
                return false;
            }
            w1[n]++;
        }
        Arrays.sort(w1); Arrays.sort(w2);
        for(int i=0;i<w1.length;i++){
            if(w1[i]!=w2[i]) return false;
        }

        return true;
    }
}
