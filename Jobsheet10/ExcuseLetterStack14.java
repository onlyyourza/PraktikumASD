package Jobsheet10;

public class ExcuseLetterStack14 {
    ExcuseLetter14[] stack;
    int top, size;

    ExcuseLetterStack14(int size) {
        this.size = size;
        top = -1;
        stack = new ExcuseLetter14[size];
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(ExcuseLetter14 letter) {
        if (!isFull()) {
            top++;
            stack[top] = letter;
        } else {
            System.out.println("Stack is already full!!");
        }
    }

    ExcuseLetter14 pop() {
        if (!isEmpty()) {
            ExcuseLetter14 letter = stack[top];
            top--;
            return letter;
        } else {
            System.out.println("There is no excuse letter in the stack!!");
            return null;
        }
    }

    ExcuseLetter14 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no excuse letter in the stack!!");
            return null;
        }
    }

    ExcuseLetter14 search(String name) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                return stack[i];
            }
        }
        return null;
    }
}
