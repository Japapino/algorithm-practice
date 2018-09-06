public class IntStack {

    //stack
    //ordered list with special properties
    //first in first out
    //methods: push, pop

    private int [] stack;
    private int size;
    private int top;

    public IntStack(){
        top = -1;
        size = 10;
        stack = new int [10];
    }

    public IntStack(int size){
        top = -1;
        this.size = size;
        stack = new int [this.size];
    }

    public int size(){
        return this.size;
    }

    public boolean push(int value){
        if(!isFull()) {
            top++;
            stack[top] = value;
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        return (top == stack.length -1);
    }

    public int pop(){
        int value = stack[top];
        top--;
        return value;
    }



}
