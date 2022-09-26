class Solution {
    
    int uf[];
    
    public boolean equationsPossible(String[] equations) {
        uf = new int[26];
        for(int i=0; i<26; i++)
            uf[i] = i;
        
        for(String s: equations){
            if(s.charAt(1)=='='){
                int par1 = find((int)(s.charAt(0)-'a'));
                int par2 = find((int)(s.charAt(3)-'a'));
                
                if(par1!=par2)
                    uf[par2] = par1;
            }
        }
        
        for(String s: equations){
            if(s.charAt(1)=='!'){
                int par1 = find((int)(s.charAt(0)-'a'));
                int par2 = find((int)(s.charAt(3)-'a'));
                
                if(par1==par2)
                    return false;
            }
        }
        
        return true;
    }
    
    public int find(int obj){
        return uf[obj] == obj ? obj : find(uf[obj]);
    }
}
