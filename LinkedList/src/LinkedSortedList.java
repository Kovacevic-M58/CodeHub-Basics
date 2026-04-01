public class LinkedSortedList extends LinkedList{

    @Override
    public void add(double value){
        Node newNode = new Node(value);

        if(head == null || value < head.data){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        while(current.next != null && current.next.data < value ){
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }




}
