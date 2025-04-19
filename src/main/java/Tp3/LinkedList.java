package Tp3;

public class LinkedList {
    private ListElement head;

    public final class ListElement {
        public ListElement next;
        public Object val;

        public ListElement(ListElement next, Object val) {
            this.next = next;
            this.val = val;
        }
    }

    public LinkedList() {
        head = null;
    }

    private LinkedList(ListElement e) {
        head = e;
    }

    public void insertHead(Object val) {
        head = new ListElement(head, val);
    }

    public Object getHead() {
        if (head == null) {
            return null;
        } else {
            return head.val;
        }
    }

    public LinkedList getTail() {
        if ((head == null) || (head.next == null)) {
            return new LinkedList();
        }
        return new LinkedList(head.next);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public class Iterator {
        private ListElement current = head;

        public boolean hasNext() {
            return current != null;
        }

        public Object next() {
            Object temp = null;
            if (current != null) {
                temp = current.val;
                current = current.next;
            }
            return temp;
        }
    }

    public Iterator iterator() {
        return new Iterator();
    }
}