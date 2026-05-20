package CaseMethod2;

class QueueNode {
    int       queueNumber;
    Buyer     buyer;
    QueueNode prev;
    QueueNode next;

    QueueNode(int queueNumber, Buyer buyer) {
        this.queueNumber = queueNumber;
        this.buyer       = buyer;
    }
}

// Double linked list FIFO untuk antrian pembeli
class QueueList {
    QueueNode head;
    QueueNode tail;
    int counter = 0;

    int addQueue(Buyer buyer) {
        counter++;
        QueueNode node = new QueueNode(counter, buyer);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail      = node;
        }
        return counter;
    }

    boolean isEmpty() {
        return head == null;
    }

    Buyer removeFront() {
        if (isEmpty()) return null;
        Buyer b = head.buyer;
        head    = head.next;
        if (head == null) tail      = null;
        else              head.prev = null;
        return b;
    }

    void printQueue() {
        System.out.println("================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("================================");
        if (isEmpty()) {
            System.out.println("(Antrian masih kosong)");
            return;
        }
        System.out.printf("%-14s%-20s%s%n", "No Antrian", "Nama", "No HP");
        for (QueueNode cur = head; cur != null; cur = cur.next)
            System.out.printf("%-14d%-20s%s%n",
                    cur.queueNumber, cur.buyer.name, cur.buyer.mobileNumber);
    }
}
