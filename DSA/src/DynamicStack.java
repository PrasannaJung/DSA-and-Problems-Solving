public class DynamicStack extends StackImplementation {
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public void push(int data){
        if(super.isFull()){
            int[] newArr = new int[stack.length * 2];
            for(int i = 0; i < stack.length; i++ ){
                newArr[i] = stack[i];
            }
            stack = newArr;
        }

        // now if isn't full we can just insert it as it is
        super.push(data);
    }

    public static void main(String[] args) {
        var st = new DynamicStack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.peek();
    }

}
