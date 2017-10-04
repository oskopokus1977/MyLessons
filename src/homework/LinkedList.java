package homework;//Найти n-ный с конца элемент для связного списка, n-ный элемент

class Node<T> {
    T value;
    Node next;

    public Node(T value) {
        this.value = value;
    }
}

public class LinkedList<T> {
    Node first;
   Node last;

    public void addElement(T value) {
        Node node = new Node(value);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public Object getElementFromTheEnd(int endIndex) {
        Node node = first;
        int index = 1;
        while (node.next != null) {
            node = node.next;
            index++;
        }
        int i = 1;
        Node node1 = first;
        while (i != (index - endIndex + 1)) {
            node1 = node1.next;
            i++;
        }
        return node1.value;
    }

    public Object getElementFromTheFront(int n) {
        Node node = first;
        int i = 1;
        if (n == 1) {
            return first.value;
        }
        while (n != i) {
            node = node.next;
            i++;
        }
        return node.value;
    }


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addElement("ukraine");
        list.addElement("russia");
        list.addElement("moldova");
        list.addElement("georgia");
        list.addElement("armenia");
        list.addElement("china");
        System.out.println(list.getElementFromTheFront(5));
        System.out.println(list.getElementFromTheEnd(2));
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addElement(1);
        list1.addElement(2);
        list1.addElement(3);
        list1.addElement(4);
        list1.addElement(5);
        list1.addElement(6);
        System.out.println(list1.getElementFromTheFront(5));
        System.out.println(list1.getElementFromTheEnd(2));

    }
}


