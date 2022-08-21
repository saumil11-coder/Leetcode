class Solution {
    //eg :- stamp='abc', target='ababc' -> target='*****'
    //start iterating over target if target has stamp or not
    //if it contains stamp, then replace all characters corresponding to stamp with *
    //also while comparing target with stamp,
    //* can be substituted with any character because this will be overwritten
    
    //step 1:- target = 'ababc'
    //step 2:- target = 'ab***'(abc has been replaced with stars)
    //step 3:- target = '*****'(ab* can make abc by substituting * with c, therefore replace it with star)
    
    //this is the approach we would be following
    //carefully read the code to better understand the approach
    public int[] movesToStamp(String stamp, String target) {
        //reverse engineering should be used
        //start from T and convert it to all stars
        //if it is not possible, then return empty array

        char S[]=stamp.toCharArray();
        char T[]=target.toCharArray();
        ArrayList<Integer> arr=new ArrayList<>();
        //checking if we have already checked this index
        boolean visited[]=new boolean[T.length-S.length+1];
        //checks if there is a change in T in this iteration
        boolean change=true;
        //stores number of stars
        int stars=0;
        
        while(stars<T.length){
            //initially keep it false
            change=false;
            
            for(int i=0;i<=T.length-S.length;i++){
                //if we have not checked index i and from this index T follows the pattern of S
                //then convert it to stars
                //and add this index to arr
                if(!visited[i] && check(S,T,i)){
                    stars+=replace(S,T,i);
                    change=true;
                    visited[i]=true;
                    arr.add(i);
                }
            }
            
            //if we were not able to find any position for change
            //then return empty array
            if(change==false){
                return new int[0];
            }
        }
        
        int ans[]=new int[arr.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=arr.get(arr.size()-i-1);
        }
        
        return ans;
    }

    //checking if this substring follows the pattern of S 
    private boolean check(char S[],char T[],int ind){
        for(int i=0;i<S.length;i++){
            if(T[i+ind]!='*' && S[i]!=T[i+ind]){
                return false;
            }
        }
        
        return true;
    }
    //replacing characters with stars
    private int  replace(char S[],char T[],int ind){
        int count=0;
        for(int i=0;i<S.length;i++){
            if(T[i+ind]!='*'){
                count++;
                T[i+ind]='*';
            }
        }
        return count;
    }
}