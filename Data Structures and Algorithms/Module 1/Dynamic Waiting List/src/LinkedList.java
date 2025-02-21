public class LinkedList {
    Node head;

    public LinkedList(){
        this.head = null;
    }

    void addFirstCustomer(String name, String details){
        head = new Node(name,details);
    }
    void addCustomer(String name, String details){
        Node newNode = new Node(name,details);
        if (head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    void addVIPCustomer(String name, String details){
        Node vipNode = new Node(name,details);
        vipNode.next = head;
        head = vipNode;
    }
    void removeCustomer(String customerName){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.name.equals(customerName))
        {
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null && !current.next.name.equals(customerName)){
            current = current.next;
        }
        if(current.next != null){
            current.next = current.next.next;
        }

    }
    void updateCustomer(String customerName, String newDetails){
       if(head == null){
           System.out.println("List is Empty");
           return;
       }
        Node currentNode = head;
        while(currentNode !=null){
            if(currentNode.name.equals(customerName)){
                currentNode.details = newDetails;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        if(head.next == null)
           return "Empty Linked List";
        else{
            Node currentNode = head;
            String list = currentNode.name + " ("+currentNode.details+") ->";
            while(currentNode.next != null)
            {
                currentNode = currentNode.next;
                list += currentNode.name + " ("+currentNode.details+") ->";
            }
            return list;
        }
    }
}
