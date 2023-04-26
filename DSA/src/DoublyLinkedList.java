public class DoublyLinkedList {

    Node head;
    Node tail;
    int size;


    public DoublyLinkedList(){
        this.size = 0;
    }

    public void insertAtFirst(int data){

        Node node;

        if(head == null){
            node = new Node(data,null,null);
            head = tail = node;
            size++;
            return;
        }

        node = new Node(10);
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    public void insertAtLast(int data){
        if(size == 0){
            insertAtFirst(data);
            return;
        }

        Node node = new Node(data,null,tail);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void insert(int position,int data){
        if(position == 1){
            insertAtFirst(data);
            return;
        }else if(position == size){
            insertAtLast(data);
            return;
        }


        Node temp = head;
        for(int i = 1;i < position - 1;i++){
            temp = temp.next;
        }

//        Node node = new Node(data);
        // STORING THE NEXT OF THE CURRENT TEMP AS THE LINK WILL GET BROKEN
//        Node nextNode = temp.next;
//        temp.next = node;
//        node.next = nextNode;
//        node.prev = temp;

        // OR WE CAN DIRECTLY USE THE CONSTRUCTOR THAT TAKE NEXT AND PREV AS WELL
//        Node newNode = new Node(data,temp.next,temp);
        Node node = new Node(data,temp.next,temp);
        temp.next.prev = node;
        temp.next = node;

    }

    public Node getNode(int position){
        if(position == 1){
            return head;
        }else if(position == size){
            return tail;
        }

        Node temp = head;
        for(int i = 1; i < position;i++){
            temp = temp.next;
        }
        return temp;

    }

    public int getTailValue(){
        return tail.data;
    }

    public int getHeadValue(){
        return head.data;
    }

    public void printList(){

        Node temp = head;
        System.out.print("NULL<-");
        while(temp != null){
            System.out.print(temp.data + "<=>");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    private static class Node{
        int data;
        Node next;
        Node prev; // since this is a doubly linked list we also keep track of previous node

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtFirst(20);
        dll.insertAtFirst(10);
        dll.printList();
        System.out.println("Head and tail are "+dll.getHeadValue()+" and "+dll.getTailValue());

        dll.insertAtLast(30);
        dll.insertAtLast(40);
        dll.printList();
        System.out.println("Head and tail are "+dll.getHeadValue()+" "+dll.getTailValue());


        dll.insert(3,25);
        dll.printList();

        Node nodeAtGivenPosition = dll.getNode(3);
        System.out.println("The data at the given node is "+nodeAtGivenPosition.data);
        System.out.println("The next and prev data at given node are "+ nodeAtGivenPosition.next.prev.data +" and "+nodeAtGivenPosition.prev.data);

    }
}
