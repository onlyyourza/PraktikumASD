package Pretest;

public class Stack {
    int[] data;
    int top, max;

    public Stack(int n) {
        max = n;
        data = new int[max];
        top = -1;
    }

    public boolean IsEmpty() { return top == -1; }
    public boolean IsFull()  { return top == max - 1; }

    public void push(int dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack penuh");
        }
    }

    public int pop() {
        if (!IsEmpty()) {
            int dt = data[top];
            top--;
            return dt;
        }
        return -1;
    }

    public int peek() {       // melihat elemen teratas tanpa menghapus
        if (!IsEmpty()) {
            return data[top];
        }
        return -1;
    }
}
