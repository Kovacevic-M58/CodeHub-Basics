public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.printList();
        /*Add number to linked list*/
        //Test case 1:
        list.add(45);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(58);
        list.printList();

        list.removeList();

        //Test case 2:
        list.add(45);
        list.add(5);
        list.printList();

        list.removeList();

        //Test case 3:
        list.printList();

        System.out.println("---------------------");
        /*Add number at position*/
        //Test case 1:
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.addAtPosition(2, 6);

        list.printList();
        list.removeList();

        //Test case 2:
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.addAtPosition(0, 6);

        list.printList();
        list.removeList();

        //Test case 3:
        list.addAtPosition(0, 6);
        list.printList();
        list.removeList();

        //Test case 4:
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.addAtPosition(0, 23);
        list.printList();
        list.addAtPosition(0, 6);
        list.printList();
        list.removeList();

        System.out.println("---------------------");
        /*Remove number from position*/
        //Test case 1:
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.removeAtPosition(0);
        list.printList();

        list.removeList();

        //Test case 2:
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.removeAtPosition(2);
        list.printList();

        list.removeList();

        //Test case 3:
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.removeAtPosition(12);
        list.printList();

        list.removeList();

        //Test case 4:
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.removeAtPosition(0);
        list.removeAtPosition(1);
        list.printList();

        list.removeList();

        //Test case 5:
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.removeAtPosition(0);
        list.removeAtPosition(0);
        list.printList();

        list.removeList();

        System.out.println("---------------------");
        /*Find average value of linked list*/
        //Test case 1:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.findAverage());

        list.removeList();

        //Test case 2:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4.5);
        list.add(5);
        System.out.println(list.findAverage());

        list.removeList();

        //Test case 3:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.findAverage());
        list.addAtPosition(4, 6);
        System.out.println(list.findAverage());

        System.out.println("---------------------");
        /*Search for the node in the list*/
        //Test case 1:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int pos = list.search(3);
        if(pos != -1)
            System.out.println("Node is found at " + (pos + 1) + " position");
        else
            System.out.println("Node doesn't exist");

        list.removeList();

        //Test case 2:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        pos = list.search(-11);
        if(pos != -1)
            System.out.println("Node is found at " + (pos + 1) + " position");
        else
            System.out.println("Node doesn't exist");

        list.removeList();

        //Test case 3:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        pos = list.search(2);
        if(pos != -1)
            System.out.println("Node is found at " + (pos + 1) + " position");
        else
            System.out.println("Node doesn't exist");

        list.addAtPosition(1, 6);

        pos = list.search(2);
        if(pos != -1)
            System.out.println("Node is found at " + (pos + 1) + " position");
        else
            System.out.println("Node doesn't exist");

        list.removeList();

        System.out.println("---------------------");
        /*Compare numbers*/
        //Test case 1:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int result = list.compareElements(1, 2);
        if(result == 2)
            System.out.println("First number is greater");
        else if(result == 3)
            System.out.println("Second number is greater");
        else if(result == -1)
            System.out.println("Element's are equal");

        list.removeList();

        //Test case 2:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        result = list.compareElements(2, 1);
        if(result == 3)
            System.out.println("First number is greater");
        else if(result == 2)
            System.out.println("Second number is greater");
        else if(result == -1)
            System.out.println("Element's are equal");

        list.removeList();

        //Test case 3:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        result = list.compareElements(2, 2);
        if(result == -1)
            System.out.println("Element's are equal");

        list.removeList();

        //Test case 4:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        result = list.compareElements(2, 33);
        if(result == -1)
            System.out.println("One of the node's doesn't exist in list");

        list.removeList();

        //Test case 5:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        result = list.compareElements(1, 2);
        if(result == 2)
            System.out.println("First number is greater");
        else if(result == 3)
            System.out.println("Second number is greater");

        list.add(6);

        result = list.compareElements(5, 4);
        if(result == 5)
            System.out.println("First number is greater");
        else if(result == 4)
            System.out.println("Second number is greater");

        list.removeList();


        System.out.println("---------------------");
        /*Greater than given value*/
        //Test case 1:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.printGreaterThan(3);

        list.removeList();

        //Test case 2:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.printGreaterThan(33);

        list.removeList();

        //Test case 4:
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(5);

        list.printGreaterThan(3);

        list.removeList();

        //Test case 5:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.printGreaterThan(3);

        list.addAtPosition(4, 6);

        list.printGreaterThan(3);

        list.removeList();

        System.out.println("---------------------");
        /*Sort list*/
        //Test case 1:
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(5);

        list.sortList();
        list.printList();

        list.removeList();

        //Test case 2:
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(5);

        list.addAtPosition(0, 6);
        list.printList();

        list.sortList();
        list.printList();

        list.removeList();

        //Test case 3:
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(5);

        list.addAtPosition(0, 6);
        list.addAtPosition(1, 7);
        list.printList();

        list.sortList();
        list.printList();

        list.removeList();
    }
}