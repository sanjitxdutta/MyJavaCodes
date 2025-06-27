import java.util.*;

interface IGenSimpleStack<T>{
    public void push(T item) throws StackFullException;
    public void pop() throws StackEmptyException;
    public boolean isFull();
    public boolean isEmpty();
}

class GenSimpleStack<T>{
    T[] data;
    int tos = 0;
    GenSimpleStack(T[] ds){
        this.data = ds;
        tos = 0;
    }

    public void push(T item)throws StackFullException{
        if(isFull()){
            throw new StackFullException(data.length);
        }
        data[tos++]=item;
    }

    public void pop()throws StackEmptyException{
        if(isEmpty()){
            throw new StackEmptyException();
        }
        tos--;
        System.out.println(data[tos] + " ");
    }

    public boolean isFull(){
        return tos == data.length;
    }
    public boolean isEmpty(){
        return tos == 0;
    }
}

class StackFullException extends Exception{
    int size;
    StackFullException(int s){
        super("Stack Full.");
        size = s;
    }
    public String toString(){
        return ("[Full-" + size + "]");
    }
}

class StackEmptyException extends Exception{
    StackEmptyException(){
        super("Stack Empty.");
    }
    public String toString(){
        return ("[Empty]");
    }
}

public class simpleStack {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        final int MAX = 5;
        String [] st = new String[MAX];
        GenSimpleStack<String> stack = new GenSimpleStack<String>(st);

        while(true) {
            int ch = sc.nextInt();
            switch(ch) {
                case 0:
                    System.exit(1);
                    break;
                case 1:
                    try {
                        stack.push(sc.next());
                    }
                    catch (StackFullException err) {
                        System.out.print(err);
                    }
                    break;
                case 2:
                    try {
                        stack.pop();
                    }
                    catch (StackEmptyException err) {
                        System.out.print(err);
                    }
                    break;
            }
        }
        
    }
}
