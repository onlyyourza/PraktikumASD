package Jobsheet13;

public class Node {
    Student14 data;
    Node prev;
    Node next;

    Node(){
    }
    Node(Student14 data){
        this.data = data;
        prev = null;
        next = null;
    }
    Node(Node prev, Student14 data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
