class LRUCache {
    class Node{
        int key;
        int val;
        Node prev ;
        Node next;

        Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }

    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);

    int cap;

    HashMap<Integer , Node> m = new HashMap<>();


    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }

    private void addNode(Node newnode){
        Node temp = head.next;

        newnode.next = temp;
        newnode.prev = head ;

        head.next = newnode;
        temp.prev = newnode;
    }

    private void deleteNode(Node delnode){
        Node bef = delnode.prev;
        Node aft = delnode.next;

        bef.next = aft;
        aft.prev = bef;

    }
    
    public int get(int key) {
        if(m.containsKey(key)){
            Node resNode = m.get(key);
            int ans = resNode.val;

            m.remove(key);
            deleteNode(resNode);
            addNode(resNode);

            m.put(key,resNode);
            return ans;
        }

        return -1;


    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)){
            Node curr = m.get(key);
            m.remove(key);
            deleteNode(curr);
        }

        if(m.size() == cap){
            m.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        
        Node newNode = new Node(key,value);

        addNode(newNode);
        m.put(key , newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */