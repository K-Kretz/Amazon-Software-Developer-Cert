public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFront(1);
        list.addFront(3);
        list.addFront(5);
        list.addFront(7);
        list.traverseBackward();
        list.traverseForward();
    }
}
