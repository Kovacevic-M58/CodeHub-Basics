/*Arrays methods*/
public class Methods {
    /*Returning the value at the selected index*/
    public static int returnValueAtIndex(int[] arr, int index) {
        /*Returns the value at the selected index*/
        return arr[index];
    }

    /*Prints all values from an array*/
    public static void returnAllValues(int[] arr) {
        /*for loop*/
        for(int i = 0; i < arr.length; i++) {
            System.out.print(i+1 + ". element of the array is: " + arr[i]);
            /*Makes the output look better*/
            if(i == arr.length - 1)
                System.out.println("; ");
            else
                System.out.print(", ");
        }
    }

    /*Returns the sum of all values of the array*/
    public static int returnSumOfAllValues(int[] arr){
        int sum = 0; //define sum
        /*I had a warning which said that i can replace the for loop with the
        * enhanced one, so i replaced it with this for loop*/
        for (int j : arr) {
            sum += j;
        }

        return sum;
    }

    /*Return the elements on even positions*/
    public static int[] returnEvenElements(int[] arr){
        int size; //new array size
        /*Determening if the array size is even or uneven*/
        if(arr.length%2 == 1)
            size = (arr.length - 1) / 2;
        else
            size = arr.length / 2;

        int[] evenArr = new int[size];

        int j = 0; //index for the new Array
        for (int i = 0; i < arr.length; i++)
        {

            if(i%2 == 1) {
                evenArr[j] = arr[i];
                j++;
            }
        }
        return evenArr;
    }

    /*Prints out the elements which are bigger than average*/
    public static int[] returnBiggerThanAverage(int[] arr){
        double avg;
        int sum = returnSumOfAllValues(arr);
        avg = (double) sum / arr.length;
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > avg)
                j++;
        }

        int[] biggerArray = new int[j];

        j = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > avg){
                biggerArray[j] = arr[i];
                j++;
            }
        }

        return biggerArray;
    }


    /*Returns a reversed array*/
    public static int[] returnReversed(int[] arr) {
        int helper;
        int j = arr.length - 1;
        for (int i = 0; i < arr.length/2; i++){
            helper = arr[i];
            arr[i] = arr[j];
            arr[j] = helper;
            j--;
        }
        return arr;
    }

    /*Swap every two elements of the array*/
    public static int[] returnSwappedElement(int[] arr) {
        int helper;
        int i = 0;
        while(i < arr.length -1){
            helper = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = helper;
            i+=2;
        }
        return arr;
    }

    /*Sorts an array*/
    public static void sortArray(int arr[]){
        int helper;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    helper = arr[i];
                    arr[i] = arr[j];
                    arr[j] = helper;
                }
            }
        }
    }
}