public class LinkedList {
    private Node head;

    public void add(double value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;

    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("(");
        while(current != null){
            System.out.print((int)current.data);
            current = current.next;
            if(current != null)
                System.out.print(", ");
        }
        System.out.println(")");
    }

    public void removeAtPosition(int position){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        if(position < 0) {
            System.out.println("Invalid position.");
            return;
        }

        if(position == 0){
            head = head.next;
            return;
        }

        Node current = head;
        int nodeIndex = 0;

        while(current != null && nodeIndex < position - 1){
            current = current.next;
            nodeIndex++;
        }

        if(current == null || current.next == null){
            System.out.println("Position out of range.");
            return;
        }

        current.next = current.next.next;
    }

    public double findAverage(){
        if(head == null){
            System.out.println("List is empty.");
            return 0;
        }

        Node current = head;
        double sum = 0;
        int count = 0;

        while(current != null){
            sum += current.data;
            count++;
            current = current.next;
        }

        return (double) sum / count;
    }

    public int search(double value){
        Node current = head;
        int nodeIndex = 0;

        while(current != null){
            if(current.data == value){
                return nodeIndex;
            }
            current = current.next;
            nodeIndex++;
        }

        return -1;
    }

    public Node getNodeAt(int nodeIndex){
        Node current = head;

        while(current != null){
            if(nodeIndex == 0){
                return current;
            }
            current = current.next;
            nodeIndex--;
        }
        return null;
    }

    public int compareElements(int nodeFirstIndex, int nodeSecondIndex){
        Node firstNode = getNodeAt(nodeFirstIndex);
        Node secondNode = getNodeAt(nodeSecondIndex);

        if(firstNode == null || secondNode == null){
            return -1;
        }

        if(firstNode.data > secondNode.data){
            return nodeFirstIndex;
        }
        if(firstNode.data < secondNode.data){
            return nodeSecondIndex;
        }

        return -1; // Nodes are equal
    }

    public void printGreaterThan(double number){
        Node current = head;
        int cnt = 0;
        while(current != null){
            if(current.data > number) {
                System.out.print((int)current.data + " ");
                cnt++;
            }
            current = current.next;
        }
        if(cnt == 0)
            System.out.println("Value doesn't exist.");
        else
            System.out.println();
    }

    public void addAtPosition(int position, double value){
        if(position < 0){
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(value);

        if(position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        while(current != null && position > 1){
            current = current.next;
            position--;
        }

        if(current == null){
            System.out.println("Position out of range.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeList(){
        while(head != null)
            removeAtPosition(0);
    }

    public void sortList(){
        if(head == null) return;

        boolean swapped;

        do {
            swapped = false;
            Node current = head;

            while(current.next != null){
                if(current.data > current.next.data){
                    double temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }

        } while(swapped);
    }
}
