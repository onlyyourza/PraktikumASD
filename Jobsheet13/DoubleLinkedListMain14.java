package Jobsheet13;

public class DoubleLinkedListMain14 {
    public static void main(String[] args) {
        DoubleLinkedList14 dll = new DoubleLinkedList14();
        dll.print();
        dll.addFirst(new Student14("111", "Anton", "TI-1I", 3.57));
        dll.print();
        dll.addLast(new Student14("112", "Prabowo", "TI-1I", 3.7));
        dll.print();
        dll.addFirst(new Student14("113", "Herco", "TI-1I", 3.89));
        dll.print();
        dll.insertAfter("111", new Student14("114", "Rizki", "TI-1I", 3.8));
        dll.print();
        dll.insertAfter("112", new Student14("115", "Hanzel", "TI-1I", 3.6));
        dll.print();
        dll.insertAfter("120", new Student14("116", "Eiyu", "TI-1I", 3.4));
        dll.print();
    }
}
