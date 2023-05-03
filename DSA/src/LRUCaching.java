import java.util.HashMap;

public class LRUCaching {

    Node head;
    Node tail;

    int capacity;

    LRUCaching(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
    }

    HashMap<Integer,Node> map;

    public void put(int key,int value){

        if(map.containsKey(key)){
            // remove node
            Node node = map.get(key);
            remove(node);
        }
        if(map.size() == capacity){
            // remove tail
            remove(tail);
        }

        Node newNode = new Node(key,value);
        insert(newNode);

    }

    public void insert(Node newNode) {
        map.put(newNode.key, newNode);
        if(head == null){
            head = tail = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }

    }

    public int get(int key){
        Node node = map.get(key);

        if(node == null){
            return -1;
        }

        // removing the node
        remove(node);

        insert(node);
        return node.value;

    }

    public void remove(Node node){
        map.remove(node.key);
        if(node == head){
            Node nextNode = head.next;
            head = head.next;
            nextNode.next = null;
            return;
        }
        if(node == tail){
             Node prevNode = tail.prev;
             prevNode.next = null;
             tail.prev = null;
             tail = prevNode;
             return;
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = node.prev = null;
    }

    public static class Node{
        int key;
        int value;

        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }


}
