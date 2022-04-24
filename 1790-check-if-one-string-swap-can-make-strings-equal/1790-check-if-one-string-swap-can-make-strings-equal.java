class Solution {
 public boolean areAlmostEqual(String s1, String s2) {
  if(s1.equals(s2)) return true;
int unmatched=0;
 for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){ // if character's not equal, increment
                unmatched++;
            }
        }
        if(unmatched!=2) return false;
if(unmatched!=2) return false;
boolean gotOneUnmatched=false;
int firstIndex=0; int secondIndex=0;
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)!=s2.charAt(i))
{
 if(gotOneUnmatched == false){
                    firstIndex = i; // to store first index
                    gotOneUnmatched = true; // change it to true so that we can catch secondIndex next time.
                }
                else{
                    secondIndex = i; // to store second index
                }
}
}
if(s1.charAt(firstIndex)==s2.charAt(secondIndex)&&s2.charAt(firstIndex)==s1.charAt(secondIndex))
{return true;
}
return false;
}
}