public class StackUsingLL {

    SinglyLinkedList linkedList;
    Node top;

    public  StackUsingLL(){
        linkedList = new SinglyLinkedList();
    }

    public void push(int data){
        linkedList.insertAtFirst(data);
        top = linkedList.getHeadNode();
    }

    public void pop(){
        linkedList.deleteNode(1);
        top = linkedList.getHeadNode();
    }

    public int peek(){
        return top.data;
    }

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(10);
        stack.push(30);
        stack.push(50);

        stack.pop();

        System.out.println(stack.peek());
    }


}
