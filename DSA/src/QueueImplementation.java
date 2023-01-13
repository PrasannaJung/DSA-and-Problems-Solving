public class QueueImplementation {

    int front;
    int rear;
    int[] data;
    int size;

    public QueueImplementation(int size){
        this.size = size;
        this.data = new int[size];
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(int item){
        if(!isFull()){
            rear++;
            if(rear == size-1){
                rear = 0;
            }
            data[rear] = item;
        }else{
            System.out.println("Queue is already full");
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            front++;
            int item = data[front-1];
            if(front == size - 1 ){
                System.out.println(item+" has been removed!");
                front = 0;
            }else{
                System.out.println(item+" has been removed!");
            }
        }
    }

    public void peekFront(){
        int frontItem = data[front];
        System.out.println("The item at front is: "+frontItem);
    }

    public void peekRear(){
        int lastItem = data[rear];
        System.out.println("The item at rear is: "+lastItem);
    }

    public boolean isEmpty(){
        return rear == -1;
    }

    public boolean isFull(){
        return rear == size;
    }

    public static void main(String[] args) {

        QueueImplementation q = new QueueImplementation(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.peekFront();
        q.peekRear();
        q.enqueue(4);
        q.peekRear();
    }
}