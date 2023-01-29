class Node{
	int key;
	int val;
	Node next;
	Node prev;
	int freq=1;
	Node(int k,int v){
		key=k;
		val=v;
	}
}
class DoublyLinkedList{
	Node head;
	Node tail;
	DoublyLinkedList(){
		head=new Node(-1,-1);
		tail=new Node(-1,-1);
		head.next=tail;
		tail.prev=head;
	}
	void addNode(Node v){
		Node next=head.next;
		head.next=v;
		v.prev=head;
		head.next=v;
		v.next=next;
		next.prev=v;
	}
	Node removeNode(){
		Node node=tail.prev;
		node.prev.next=tail;
		tail.prev=node.prev;
		return node;
	}
	Node removeNode(Node v){
		Node prev=v.prev;
		Node next=v.next;
		prev.next=next;
		next.prev=prev;
		return v;
	}
	boolean isEmpty(){
		if(head.next==tail)
			return true;
		return false;
	}
}
class LFUCache {
    HashMap<Integer,DoublyLinkedList> freqList=new HashMap<Integer,DoublyLinkedList>();
	HashMap<Integer,Node> lfuCache =new HashMap<Integer,Node>(); 
	int capacity;
	int minFreq;
    public LFUCache(int capacity) {
        this.capacity=capacity;
        minFreq=1;
    }
    public int get(int key) {
        if(lfuCache.get(key)==null)
        	return -1;
       	Node v=lfuCache.get(key);
       	freqList.get(v.freq).removeNode(v);
       	if(freqList.get(v.freq).isEmpty()){
       		if(minFreq==v.freq){
                minFreq=v.freq+1;
            }
       	}
       	v.freq+=1;
       	if(freqList.get(v.freq)==null){
       		DoublyLinkedList d=new DoublyLinkedList();
       		d.addNode(v);
       		freqList.put(v.freq,d);
       	}
       	else{
       		freqList.get(v.freq).addNode(v);
       	}
       	return v.val;
    }
    
    public void put(int key, int value) {
        if(capacity==0)
            return;
        if(lfuCache.get(key)!=null){
        	Node v=lfuCache.get(key);
        	freqList.get(v.freq).removeNode(v);
        	if(freqList.get(v.freq).isEmpty()){
                if(minFreq==v.freq)
        		minFreq=v.freq+1;
        	}
	       	v.freq+=1;
	       	if(freqList.get(v.freq)==null){
	       		 DoublyLinkedList d=new DoublyLinkedList();
	       		d.addNode(v);
	       		freqList.put(v.freq,d);
	       	}
	       	else{
	       		freqList.get(v.freq).addNode(v);
	       	}
	       	v.val=value;
	      }
	      else{
	     		if(lfuCache.size()==capacity){
	     			Node v=freqList.get(minFreq).removeNode();
	     			lfuCache.remove(v.key);			
	     		}
	     		Node newNode = new Node(key,value);
	     		lfuCache.put(key,newNode);
	     		if(freqList.get(1)!=null){
	     			freqList.get(1).addNode(newNode);
	     		}
	     		else{
	     			DoublyLinkedList d=new DoublyLinkedList();
	     			d.addNode(newNode);
	     			freqList.put(1,d);
	     		}
               minFreq=1;
	      }
    }
}
