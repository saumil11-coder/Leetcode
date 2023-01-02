class Solution {
    public boolean detectCapitalUse(String word) {
        
        char array[] = word.toCharArray();
      if(word.equals(word.toUpperCase()))
          return true;
       else if(Character.isUpperCase(word.charAt(0)))
        {
            for(int i=1;i<word.length();i++)
            {
                if(Character.isUpperCase(array[i]))
                    return false;
            }
          
           }
        else if(Character.isLowerCase(word.charAt(0)))
        {
              for(int i=1;i<word.length();i++)
            {
                if(Character.isUpperCase(array[i]))
                    return false;
            }
            
        }
        else if(Character.isUpperCase(word.charAt(0)))
        {
             for(int i=1;i<word.length();i++)
            {
                if(Character.isLowerCase(array[i]))
                    return true;
            }
            
        }
        else{
            for(int i=0;i<word.length();i++)
            {
                if(Character.isLowerCase(array[i]))
                    return true;
            }
            
            
        }
        return true;
    }
}