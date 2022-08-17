class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String []morseCode={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> decode=new HashSet<>();
        for(String word:words)
        {
            StringBuilder sb=new StringBuilder();
            for(char c:word.toCharArray())
            {
                int index=c-'a';
                sb.append(morseCode[index]);
            }
            decode.add(sb.toString());
        }
        return decode.size();
        
    }
}