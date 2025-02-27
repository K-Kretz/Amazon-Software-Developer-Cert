public class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void addFront(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            // new node’s next refers to the head
            newNode.next = head;
            // current head’s prev refers to the new node
            head.prev = newNode;
            // new node becomes the head
            head = newNode;
        }
    }

    public void addEnd(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            // new node’s prev refers to the tail
            newNode.prev = tail;
            // current head’s next refers to the new node
            tail.next = newNode;
            // new node becomes the tail
            tail = newNode;
        }
    }
    public void addAfter(int data, Node prevNode){
        if(prevNode == null){
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;
        if(newNode.next == null){
            tail = newNode;
        }
        else{
            newNode.next.prev = newNode;
        }
    }
    public void traverseForward(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data+ " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    public void traverseBackward(){
        Node currentNode = tail;
        while(currentNode != null){
            System.out.println(currentNode.data+ " ");
            currentNode = currentNode.prev;
        }
        System.out.println();
    }
    public void removeFront(){
        if (head == null) {		// check if the head is null
            System.out.println("List is Empty");
            return; // if it is, return because there is nothing to remove. The list is already empty
        }
        head = head.next;	// set the head to the next node
        if (head != null) {		// check if the head is not null
            head.prev = null;	// set the previous of the head to null
        } else {
            // If the head is null, there were no other nodes on the list except for the one you removed.
            // The list is now empty, so you must also set the tail to null.
            tail = null;  }
    }
    public void removeBack(){
        if (tail == null) {
            return; // List is already empty
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            // If the tail is now null, it means the list had only one node, which has been removed.
            // Set head to null to indicate that the list is completely empty.
            head = null;
        }
    }
    public void removeNode(Node node){
        if(node == null){
            return;
        }
        if(node == head){
            removeFront();
            return;
        }
        if(node == tail){
            removeBack();
            return;
        }
        // Update the previous node's next pointer
        node.prev.next = node.next;
        // Update the next node's previous pointer
        node.next.prev = node.prev;
    }
}
