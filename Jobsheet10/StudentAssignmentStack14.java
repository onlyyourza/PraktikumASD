package Jobsheet10;

public class StudentAssignmentStack14 {
    Student14[] stack;
    int top, size;

    int countAssignments() {
        return top + 1;
    }

    StudentAssignmentStack14(int size) {
        this.size = size;
        top = -1;
        stack = new Student14[size];
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Student14 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!!");
        }
    }

    Student14 pop() {
        if (!isEmpty()) {
            Student14 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    Student14 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    Student14 peekFirst() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    String convertToBinary(int grade) {
        ConversionStack14 stack = new ConversionStack14();
        while (grade > 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
        }
        System.out.println("");
    }
}
