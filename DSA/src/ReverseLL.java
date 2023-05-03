public class ReverseLL {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.printList();

        reverseList(list);
        list.printList();


    }

    static void reverseList(SinglyLinkedList list){
        Node head = list.getHeadNode();
        Node current = head;
        Node prev = null;
        Node next = current.next;

        while(current != null){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }

        list.setHead(list.getTailNode());
        list.setTail(list.getHeadNode());
    }



}
