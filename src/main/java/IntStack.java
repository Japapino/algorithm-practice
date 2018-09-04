public class IntStack {

    //stack
    //ordered list with special properties
    //first in first one
    //methods: push, pop

    private int [] stack;
    private int top;
    private int size;

    public IntStack(){
        top = -1;
        size = 50;
        stack = new int [50];
    }

    public IntStack(int size){
        top = -1;
        this.size = size;
        stack = new int [this.size];
    }


}
