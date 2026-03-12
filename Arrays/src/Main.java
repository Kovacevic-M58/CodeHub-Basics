/*Arrays task*/
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        Methods methods = new Methods();

        int index = 3;    //index value
        System.out.print("Value at the selected index " + index + " is: ");

        System.out.println(methods.getValueAtIndex(arr, index));

        methods.printValues(arr);

        int sum = methods.sumValues(arr);
        System.out.println("The sum of the selected array is: " + sum);

        methods.printValues(methods.getEvenElements(arr));

        methods.printValues(methods.getBiggerThanAverage(arr));

        methods.printValues(methods.reverseArray(arr));
        methods.reverseArray(arr);

        methods.printValues(methods.getSwappedElements(arr));

        methods.sortArray(arr);
        methods.printValues(arr);

    }
}