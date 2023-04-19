public class StackImplementation {

  protected int[] stack;
  int pointer = -1;
  static int DEFAULT_SIZE = 5;

  public StackImplementation() {
    this(DEFAULT_SIZE);
  }

  public StackImplementation(int size) {
    this.stack = new int[size];
  }

  public void push(int num) {
    if (!isFull()) {
      pointer++;
      stack[pointer] = num;
      System.out.println(num + " has been inserted!!");
    } else {
      System.out.println("Stack is full!!");
    }
  }

  public void pop() {
    if (!isEmpty()) {
      int removedValue = stack[pointer];
      pointer--;
      System.out.println(removedValue + " has been removed!!");
    } else {
      System.out.println("Stack is empty!!");
    }
  }

  public boolean isFull() {
    return pointer == stack.length - 1;
  }

  public boolean isEmpty() {
    return pointer == -1;
  }

  public void peek() {
    int currentValue = stack[pointer];
    System.out.println("The topmost value is " + currentValue);
  }

  public static void main(String[] args) {
    StackImplementation st = new StackImplementation(5);
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6);
    st.peek();
  }
}
