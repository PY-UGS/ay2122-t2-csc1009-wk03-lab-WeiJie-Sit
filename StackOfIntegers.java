package T4;

public class StackOfIntegers {
    private int elements[];
    private int size;

    public StackOfIntegers(){
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfIntegers(int capacity){
        this.elements = new int[capacity];
        this.size = 0;
    }

    public boolean empty(){
        if(this.size == 0){
            return true;
        }else {
            return false;
        }
    }
    public int peek(){
        return this.elements[this.size-1];
    }

    public void push(int value){
        this.elements[this.size] = value;
        this.size ++;

    }
    public int pop(){
        int value = this.elements[this.size-1];
        this.size--;
        return value;
    }

    public int getSize() {
        return size;
    }

}

