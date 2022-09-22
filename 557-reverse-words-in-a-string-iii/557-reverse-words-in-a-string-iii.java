class Solution {
    
    
    public String reverseWords(String s) {
        
        StringBuilder result = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        boolean first = true;
        for(char c: s.toCharArray()){
            if(c!=' ')
                tmp.append(c);
            else{
                if(!first)
                    result.append(' ');
                first = false;
                result.append(tmp.reverse().toString());
                tmp = new StringBuilder();
            }
        }
        
        if(!first)
            result.append(' ');
        result.append(tmp.reverse().toString());
        
        return result.toString();
    }
}
