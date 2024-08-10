package LinkedList.SinglyLL;

class node {
    int data;
    node next;

    node(int val) {
        this.data = val;
        this.next = null;
    }
}

class LinkedList {
    private node head;

    public void traversal() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void add(int key) {
        node newNode = new node(key);
        if (head == null) {
            head = newNode;
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int key) {
        if (head == null)
            return;
        if (head.data == key) {
            head = head.next;
            return;
        }
        node current = head;

        while (current.next != null && current.next.data != key) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public boolean contains(int data) {
        node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

public class SinglyLL_Creation_Traversal {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.traversal(); 
        System.out.println();
        list.remove(20);
        list.traversal(); 
        System.out.println(list.contains(30));
        System.out.println(list.contains(20));
    }
}
