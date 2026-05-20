package CaseMethod2;

class OrderNode {
    Order     order;
    OrderNode prev;
    OrderNode next;

    OrderNode(Order order) {
        this.order = order;
    }
}

// Double linked list untuk daftar pesanan
class OrderList {
    OrderNode head;
    OrderNode tail;

    void addOrder(Order order) {
        OrderNode node = new OrderNode(order);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail      = node;
        }
    }

    boolean hasCode(int code) {
        for (OrderNode cur = head; cur != null; cur = cur.next)
            if (cur.order.orderCode == code) return true;
        return false;
    }

    // Bubble sort manual A-Z berdasarkan nama pesanan (tukar isi node)
    private void sortByName() {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            for (OrderNode cur = head; cur.next != null; cur = cur.next) {
                if (cur.order.orderName.compareToIgnoreCase(cur.next.order.orderName) > 0) {
                    Order tmp      = cur.order;
                    cur.order      = cur.next.order;
                    cur.next.order = tmp;
                    swapped        = true;
                }
            }
        } while (swapped);
    }

    void printReport() {
        sortByName();
        System.out.println("================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("================================");
        if (head == null) {
            System.out.println("(Belum ada pesanan)");
            return;
        }
        System.out.printf("%-16s%-22s%s%n", "Kode Pesanan", "Nama Pesanan", "Harga");
        int total = 0;
        for (OrderNode cur = head; cur != null; cur = cur.next) {
            System.out.printf("%-16d%-22s%d%n",
                    cur.order.orderCode, cur.order.orderName, cur.order.price);
            total += cur.order.price;
        }
        System.out.println("================================");
        System.out.println("Total Pendapatan : " + total);
    }
}
