class MyHashSet {

    boolean[] arr=new boolean[100];
public MyHashSet() {

        
    }
    
    public void add(int key) {
	if(key>=arr.length)
arr=  Arrays.copyOf(arr,key+1);
arr[key]=true;      
    }
    
    public void remove(int key) {
	if(key<arr.length)
arr[key]=false;
        
    }
    
    public boolean contains(int key) {
        return (key<arr.length)?arr[key]:false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */