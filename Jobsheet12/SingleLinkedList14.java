package Jobsheet12;

public class SingleLinkedList14 {

    Node14 head;
    int size;

    public SingleLinkedList14() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // print — tampilkan seluruh isi list dari head ke tail
    public void print() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        Node14 current = head;
        int index = 0;
        while (current != null) {
            System.out.println("[Indeks " + index + "]");
            current.data.print();
            System.out.println("----------------------------");
            current = current.next;
            index++;
        }
    }

    // addFirst — sisipkan node baru di posisi paling awal (head)
    public void addFirst(Student14 data) {
        Node14 newNode = new Node14(data);
        newNode.next = head; // node baru menunjuk ke head lama
        head = newNode;      // head diperbarui ke node baru
        size++;
    }

    // addLast — sisipkan node baru di posisi paling akhir (tail)
    public void addLast(Student14 data) {
        Node14 newNode = new Node14(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            // telusuri sampai node terakhir (next == null)
            Node14 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // insertAfter — sisipkan node baru tepat setelah node dengan NIM tertentu
    public void insertAfter(String targetNim, Student14 data) {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        Node14 current = head;
        while (current != null) {
            if (current.data.nim.equals(targetNim)) {
                Node14 newNode = new Node14(data);
                newNode.next = current.next; // sambungkan ke node setelah current
                current.next = newNode;      // sambungkan current ke node baru
                size++;
                System.out.println("Data berhasil disisipkan setelah NIM " + targetNim + ".");
                return;
            }
            current = current.next;
        }
        System.out.println("NIM " + targetNim + " tidak ditemukan di dalam list.");
    }

    // insertAt — sisipkan node baru pada indeks tertentu
    public void insertAt(int index, Student14 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks " + index + " tidak valid. Rentang: 0–" + size);
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        // maju ke node sebelum posisi target
        Node14 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node14 newNode = new Node14(data);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    // getData — kembalikan data mahasiswa pada indeks tertentu
    public Student14 getData(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks " + index + " tidak valid. Rentang: 0–" + (size - 1));
            return null;
        }
        Node14 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // indexOf — kembalikan indeks pertama dari node dengan NIM tertentu, atau -1 jika tidak ditemukan
    public int indexOf(String nim) {
        Node14 current = head;
        int index = 0;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // removeFirst — hapus node pertama dan kembalikan datanya
    public Student14 removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus.");
            return null;
        }
        Student14 removed = head.data;
        head = head.next; // geser head ke node kedua
        size--;
        return removed;
    }

    // removeLast — hapus node terakhir dan kembalikan datanya
    public Student14 removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus.");
            return null;
        }
        // jika hanya ada satu node, gunakan removeFirst
        if (head.next == null) {
            return removeFirst();
        }
        // telusuri sampai satu langkah sebelum tail
        Node14 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Student14 removed = current.next.data;
        current.next = null; // putuskan koneksi ke tail lama
        size--;
        return removed;
    }

    // remove — hapus node pertama yang memiliki NIM tertentu
    public boolean remove(String nim) {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return false;
        }
        // khusus jika node target adalah head
        if (head.data.nim.equals(nim)) {
            removeFirst();
            return true;
        }
        // cari node sebelum target
        Node14 current = head;
        while (current.next != null) {
            if (current.next.data.nim.equals(nim)) {
                current.next = current.next.next; // lewati node target
                size--;
                return true;
            }
            current = current.next;
        }
        System.out.println("NIM " + nim + " tidak ditemukan di dalam list.");
        return false;
    }

    // removeAt — hapus node pada indeks tertentu dan kembalikan datanya
    public Student14 removeAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks " + index + " tidak valid. Rentang: 0–" + (size - 1));
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        Node14 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Student14 removed = current.next.data;
        current.next = current.next.next;
        size--;
        return removed;
    }
}
