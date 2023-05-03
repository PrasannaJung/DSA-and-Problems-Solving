public class QueueUsingLL {

    SinglyLinkedList linkedList;
    Node front;
    Node rear;

    public QueueUsingLL(){
        linkedList = new SinglyLinkedList();
    }

    public void enqueue(int data){
        linkedList.insertAtLast(data);
        front = linkedList.getHeadNode();
        rear = linkedList.getTailNode();
    }

    public int dequeue(){
        int removed = front.data;
        linkedList.deleteNode(1);
        front = linkedList.getHeadNode();
        return removed;
    }

    public int peek(){
        return front.data;
    }

    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.peek());

        q.dequeue();
        System.out.println(q.peek());
    }


}
