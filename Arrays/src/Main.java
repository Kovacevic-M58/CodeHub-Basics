/*Arrays task*/
void main() {
    /*Creating the array we will be working with*/
    int[] arr = new int[5];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;
    /*I could've also done int[] arr = {1, 2, 3, 4, 5}*/

    int index = 3;    //index value
    System.out.print("Value at the selected index " + index + " is: ");
    /*Print out the value for the selected index*/
    System.out.println(Methods.returnValueAtIndex(arr, index));

    /*Prints out all the values of the array*/
    Methods.returnAllValues(arr);

    /*Returns the sum of all the values*/
    int sum = Methods.returnSumOfAllValues(arr);
    System.out.println("The sum of the selected array is: " + sum);

    /*Prints out all values at even positions and printing them all out*/
    Methods.returnAllValues(Methods.returnEvenElements(arr));

    /*Prints out all the values in the array which are bigger than the overall
    * average of the same array */
    Methods.returnAllValues(Methods.returnBiggerThanAverage(arr));

    /*Returns reversed array*/
    Methods.returnAllValues(Methods.returnReversed(arr));
    Methods.returnReversed(arr);
    /*Swap every two elements of the array*/
    Methods.returnAllValues(Methods.returnSwappedElement(arr));

    /*Sorted array*/
    Methods.sortArray(arr);
    Methods.returnAllValues(arr);

}
