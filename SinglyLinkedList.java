public class SinglyLinkedList<E> {
    ListNode<E> head;
    ListNode<E> tail;

    public SinglyLinkedList() {
        head = tail = null;
    }
       
    public boolean isEmpty() {
        return head == null;
    }

    public void inputDiAwal(E input) {
        ListNode<E> newNode = new ListNode<E>(input);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void inputDiAkhir(E input) {
        ListNode<E> newNode = new ListNode<E>(input);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void hapusDiAwal() {
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void hapusDiAkhir() {
        if (head == tail) {
            head = tail = null;
        } else {
            ListNode<E> iterator = head;

            while (iterator.next != tail) {
                iterator = iterator.next;
            }

            tail = iterator;
            iterator.next = null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }

        ListNode<E> iterator = head;
        while (iterator != null) {
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
    }
}
//.