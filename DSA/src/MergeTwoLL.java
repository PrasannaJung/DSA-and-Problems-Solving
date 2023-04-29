
public class MergeTwoLL {
    public static void main(String[] args) {

        SinglyLinkedList firstLL = new SinglyLinkedList();
        SinglyLinkedList secondLL = new SinglyLinkedList();

        firstLL.insertAtLast(1);
        firstLL.insertAtLast(2);
        firstLL.insertAtLast(9);
        firstLL.printList();
        secondLL.insertAtLast(3);
        secondLL.insertAtLast(4);
        secondLL.insertAtLast(5);
        secondLL.insertAtLast(6);
        secondLL.insertAtLast(7);
        secondLL.printList();

        SinglyLinkedList merged = mergeTwo(firstLL,secondLL);
        merged.printList();


    }

    static SinglyLinkedList mergeTwo(SinglyLinkedList lOne,SinglyLinkedList lTwo){
        SinglyLinkedList mergedList = new SinglyLinkedList();

        Node tempOne = lOne.getHeadNode();
        Node tempTwo = lTwo.getHeadNode();

        while (tempOne != null && tempTwo != null ){
            if(tempOne.data < tempTwo.data){
                mergedList.insertAtLast(tempOne.data);
                tempOne = tempOne.next;
            }else {
                mergedList.insertAtLast(tempTwo.data);
                tempTwo = tempTwo.next;
            }
        }

        while (tempOne != null){
            mergedList.insertAtLast(tempOne.data);
            tempOne = tempOne.next;
        }

        while (tempTwo != null){
            mergedList.insertAtLast(tempTwo.data);
            tempTwo = tempTwo.next;
        }
        return  mergedList;

    }

}
