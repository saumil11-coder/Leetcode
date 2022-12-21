class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> set = new HashSet<>();
        Stack<Integer> s = new Stack<>();
        int n = rooms.size();
          set.add(0);
        for(int i=0;i<rooms.get(0).size();i++){
            set.add(rooms.get(0).get(i));
            s.push(rooms.get(0).get(i));
        }
        
        while(!s.empty()){
            int i = s.pop();
            for(int j=0;j<rooms.get(i).size();j++){
                if(set.add(rooms.get(i).get(j)))
                s.push(rooms.get(i).get(j));
            }
            if(set.size()==n) return true;
        }

        return false;
    }
}